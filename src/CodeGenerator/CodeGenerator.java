package CodeGenerator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import ANTLR.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeGenerator extends DaemonScriptBaseVisitor<Void>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private JasminBytecode jasminCode;
    private int numTernary = 0;
    private HashMap<String, String> functions;


    /**
     * Constructs a code generator.
     *
     * @param types  A map containing the data types of certain nodes in the
     *               parse tree.
     */
    public CodeGenerator( JasminBytecode jasminCode,
                          ParseTreeProperty<DataType> types,
                          ParseTreeProperty<Symbol> symbols ) {
        this.jasminCode = jasminCode;
        this.types = types;
        this.symbols = symbols;
        functions = new HashMap<>();
    }

    @Override
    public Void visitMain(DaemonScriptParser.MainContext ctx) {
        // Main method
        jasminCode.add(".method public static main([Ljava/lang/String;)V");
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");
        jasminCode.add("");

        List<DaemonScriptParser.StatementContext> statements = ctx.statement();

        for (DaemonScriptParser.StatementContext statement : statements) {
            visit(statement);
        }

        jasminCode.add("return");
        jasminCode.add(".end method");
        return null;
    }

    @Override
    public Void visitFunctions(DaemonScriptParser.FunctionsContext ctx) {
        //Functions
        List<DaemonScriptParser.StatementContext> statements = ctx.statement();

        for (DaemonScriptParser.StatementContext statement : statements) {
            visit(statement);
        }

        return null;
    }

    @Override
    public Void visitAssignment(DaemonScriptParser.AssignmentContext ctx) {
        visit( ctx.expression() );
        Symbol s = symbols.get(ctx);
        if( s.getType() == DataType.INT )
            jasminCode.add("istore " + s.getLocalSlot());
        else
            jasminCode.add("astore " + s.getLocalSlot());
        return null;
    }

    //TODO Array en boolean printen!
    @Override
    public Void visitConsole_print(DaemonScriptParser.Console_printContext ctx) {
        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        visit(ctx.expression());
        if( types.get(ctx.expression()) == DataType.INT )
            jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
        else if( types.get(ctx.expression()) == DataType.STRING )
            jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else
            throw new CompilerException("Unknown type in print");
        return null;
    }

    @Override
    public Void visitExMinus(DaemonScriptParser.ExMinusContext ctx) {
        visit( ctx.expression() );
        jasminCode.add("ineg");
        return null;
    }

    @Override
    public Void visitExMultiply(DaemonScriptParser.ExMultiplyContext ctx) {
        visit( ctx.expression(0) );
        visit( ctx.expression(1) );
        jasminCode.add("imul");
        return null;
    }

    @Override
    public Void visitExAdditive(DaemonScriptParser.ExAdditiveContext ctx) {
        visit( ctx.expression(0) );
        visit( ctx.expression(1) );

        if( ctx.op.getText().equals("+") )
            jasminCode.add("iadd");
        else if( ctx.op.getText().equals("-") )
            jasminCode.add("isub");
        else
            assert false;
        return null;
    }

    @Override
    public Void visitAtomId(DaemonScriptParser.AtomIdContext ctx) {
        Symbol s = symbols.get(ctx);
        if( s.getType() == DataType.INT )
            jasminCode.add("iload " + s.getLocalSlot());
        else
            jasminCode.add("aload " + s.getLocalSlot());
        return null;
    }

    @Override
    public Void visitAtomNumber(DaemonScriptParser.AtomNumberContext ctx) {
        jasminCode.add( "ldc " + ctx.INT().getText() );
        return null;
    }

    @Override
    public Void visitAtomString(DaemonScriptParser.AtomStringContext ctx) {
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length()-1);
        jasminCode.add( "ldc \"" + value + "\"");
        return null;
    }

    @Override
    public Void visitExRelational(DaemonScriptParser.ExRelationalContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        numTernary++;

        String label;

        //OR Ctx
        if(ctx.getParent().getRuleContext().getPayload().getClass().equals(DaemonScriptParser.ExOrContext.class)){
            label = ("trueLabel" + numTernary);
            switch ( ctx.op.getText() ) {
                case "<=":  jasminCode.add("if_icmple " + label); break;
                case ">=":  jasminCode.add("if_icmpge " + label); break;
                case "<":   jasminCode.add("if_icmplt " + label); break;
                case ">":   jasminCode.add("if_icmpgt " + label); break;
                case "==":  jasminCode.add("if_icmpeq " + label); break;
                case "!=":  jasminCode.add("if_icmpne " + label); break;
                default:    break;
            }
        }else {
            label = ("elseLabel" + numTernary);
            switch ( ctx.op.getText() ) {
                case "<=":  jasminCode.add("if_icmpgt " + label); break;
                case ">=":  jasminCode.add("if_icmplt " + label); break;
                case "<":   jasminCode.add("if_icmpge " + label); break;
                case ">":   jasminCode.add("if_icmple " + label); break;
                case "==":  jasminCode.add("if_icmpne " + label); break;
                case "!=":  jasminCode.add("if_icmpeq " + label); break;
                default:    break;
            }
        }


        return null;
    }

    @Override
    public Void visitIf_statement(DaemonScriptParser.If_statementContext ctx) {
        visit(ctx.expression());

        String elseLabel = ("elseLabel" + numTernary);
        String endLabel = ("ternaryEnd" + numTernary);
        String trueLabel = ("trueLabel" + numTernary);

        if (ctx.expression().getRuleContext().getPayload().getClass().equals(DaemonScriptParser.ExOrContext.class)){
            jasminCode.add("goto " + endLabel);
        }

        jasminCode.add(trueLabel + ":");
        visit(ctx.trueVal);
        jasminCode.add("goto " + endLabel);

        jasminCode.add(elseLabel + ":");
        if (ctx.falseVal != null) {
            visit(ctx.falseVal);
        }


        jasminCode.add(endLabel + ":");

        return null;
    }

    @Override
    public Void visitWhile_statement(DaemonScriptParser.While_statementContext ctx) {

        String startLabel = ("startLabel" + (numTernary + 1));
        String elseLabel = ("elseLabel" + (numTernary + 1));

        jasminCode.add(startLabel + ":");
        if (ctx.expression() != null) {
            visit(ctx.expression());
            visit(ctx.statement_block());
            jasminCode.add("goto " + startLabel);
        }
        jasminCode.add(elseLabel + ":");

        return null;
    }

    @Override
    public Void visitExAnd(DaemonScriptParser.ExAndContext ctx) {
        visit(ctx.expression(0));
        numTernary--;
        visit(ctx.expression(1));

        return null;
    }

    @Override
    public Void visitExOr(DaemonScriptParser.ExOrContext ctx) {
        visit(ctx.expression(0));
        numTernary--;
        visit(ctx.expression(1));

        return null;
    }

    @Override
    public Void visitExConsoleScanString(DaemonScriptParser.ExConsoleScanStringContext ctx) {
        jasminCode.add("getstatic testfile/scanner Ljava/util/Scanner;");
        jasminCode.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
        return null;
    }

    @Override
    public Void visitExConsoleScanInt(DaemonScriptParser.ExConsoleScanIntContext ctx) {
        jasminCode.add("getstatic testfile/scanner Ljava/util/Scanner;");
        jasminCode.add("invokevirtual java/util/Scanner/nextInt()I");
        return null;
    }

    private String getArguments(List<TerminalNode> objTypes, List<TerminalNode> objIds) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objIds.size(); i++) {
            switch (objTypes.get(i).toString()) {
                case "Number":
                    stringBuilder.append("I");
                    break;
                case "Boolean":
                    stringBuilder.append("Z");
                    break;
                case "List":
                    stringBuilder.append("[Ljava/lang/Object;");
                    break;
                case "Text":
                    stringBuilder.append("Ljava/lang/String;");
                    break;
                default:
                    throw new CompilerException("Unknown type in args");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public Void visitFunction_declaration(DaemonScriptParser.Function_declarationContext ctx) {

        List<DaemonScriptParser.DeclarationContext> declarations = ctx.declaration();

        String returnType = ctx.OBJ_TYPE().toString();

        List<TerminalNode> objTypes = new ArrayList<>();
        List<TerminalNode> objIds = new ArrayList<>();

        for (int i = 0; i < declarations.size(); i++) {
            objTypes.add(declarations.get(i).OBJ_TYPE());
            objIds.add(declarations.get(i).ID());
        }

        String integerLit = "I";
        String booleanLit = "Z";
        String listLit = "[Ljava/lang/Object;";
        String stringLit = "Ljava/lang/String;";
        String voidLit = "V";

        //Return type switch
        switch (returnType) {
            case "Number":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")"+ integerLit);
                functions.put(ctx.ID().getText(), integerLit);
                break;
            case "Boolean":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")" + booleanLit);
                functions.put(ctx.ID().getText(), booleanLit);
                break;
            case "List":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")" + listLit);
                functions.put(ctx.ID().getText(), listLit);
                break;
            case "Text":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")" + stringLit);
                functions.put(ctx.ID().getText(), stringLit);
                break;
            case "Void":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")" + voidLit);
                functions.put(ctx.ID().getText(), voidLit);
                break;
            default:
                throw new CompilerException("Unknown return type");
        }
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");

        //code
        visit(ctx.statement_block());
        if (returnType.equals("Number")){
            jasminCode.add("ireturn");
        }else if(returnType.equals("Void")){
            //void function
            jasminCode.add("return");
        }else {
            jasminCode.add("areturn");
        }
        jasminCode.add(".end method");

        return null;
    }

    @Override
    public Void visitReturn_statement(DaemonScriptParser.Return_statementContext ctx) {
        visit(ctx.expression());
        return null;
    }

    @Override
    public Void visitFunction_call(DaemonScriptParser.Function_callContext ctx) {
        StringBuilder argsBuilder = new StringBuilder();
        if (ctx.arguments() != null){
            List<DaemonScriptParser.ExpressionContext> args = ctx.arguments().expression();
            for (DaemonScriptParser.ExpressionContext arg : args) {
                switch (arg.getRuleContext().getClass().getSimpleName()){
                    case "AtomStringContext":
                        argsBuilder.append("Ljava/lang/String;");
                        break;
                    case "AtomNumberContext":
                        argsBuilder.append("I");
                    case "AtomIdContext":
                        //TODO: get type from given ID
                        break;
                }
            }
        }
        visitChildren(ctx);

        String functionId = ctx.ID(0).getText();

        jasminCode.add("invokestatic testfile/" + functionId + "(" + argsBuilder + ")" + functions.get(functionId));
        return null;
    }
}
