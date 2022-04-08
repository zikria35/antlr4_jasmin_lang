package CodeGenerator;

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

        String trueLabel = ("ternary" + numTernary);
        String endLabel = ("ternaryEnd" + numTernary);

        if (ctx.getParent().getRuleContext().getPayload().getClass().equals(DaemonScriptParser.ExAndContext.class)) {
            //AND Ctx
            switch ( ctx.op.getText() ) {
                case "<=":  jasminCode.add("if_icmpgt " + trueLabel); break;
                case ">=":  jasminCode.add("if_icmplt " + trueLabel); break;
                case "<":   jasminCode.add("if_icmpge " + trueLabel); break;
                case ">":   jasminCode.add("if_icmple " + trueLabel); break;
                case "==":  jasminCode.add("if_icmpne " + trueLabel); break;
                case "!=":  jasminCode.add("if_icmpeq " + trueLabel); break;
                default:    break;
            }
        } else {
            //OR Ctx
            switch ( ctx.op.getText() ) {
                case "<=":  jasminCode.add("if_icmple " + trueLabel); break;
                case ">=":  jasminCode.add("if_icmpge " + trueLabel); break;
                case "<":   jasminCode.add("if_icmplt " + trueLabel); break;
                case ">":   jasminCode.add("if_icmpgt " + trueLabel); break;
                case "==":  jasminCode.add("if_icmpeq " + trueLabel); break;
                case "!=":  jasminCode.add("if_icmpne " + trueLabel); break;
                default:    break;
            }
        }

        return null;
    }

    @Override
    public Void visitIf_statement(DaemonScriptParser.If_statementContext ctx) {
        visit(ctx.expression());

        String trueLabel = ("ternary" + numTernary);
        String endLabel = ("ternaryEnd" + numTernary);

        if (ctx.falseVal != null) {
            visit(ctx.falseVal);
            jasminCode.add("goto " + endLabel);
        }

        jasminCode.add(trueLabel + ":");
        visit(ctx.trueVal);

        jasminCode.add(endLabel + ":");

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
                case "Void":
                    //TODO add void function
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

        List<TerminalNode> objTypes = new ArrayList<>();
        List<TerminalNode> objIds = new ArrayList<>();

        for (int i = 0; i < declarations.size(); i++) {
            objTypes.add(declarations.get(i).OBJ_TYPE());
            objIds.add(declarations.get(i).ID());
        }

        //Return type switch
        switch (ctx.OBJ_TYPE().toString()) {
            case "Number":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")I");
                break;
            case "Boolean":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")Z");
                break;
            case "List":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")[Ljava/lang/Object;");
                break;
            case "Text":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")Ljava/lang/String;");
                break;
            case "Void":
                jasminCode.add(".method public static "+ ctx.ID() +"("+getArguments(objTypes, objIds)+")V");
                break;
            default:
                throw new CompilerException("Unknown return type");
        }
        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");

        //code
        visit(ctx.statement_block());
        if (ctx.statement_block().block().return_statement() == null) {
            //void function
            jasminCode.add("return");
        }
        jasminCode.add(".end method");

        return null;
    }

    @Override
    public Void visitReturn_statement(DaemonScriptParser.Return_statementContext ctx) {
        visit(ctx.expression());
        System.out.println(ctx.expression().getText());
        return null;
    }

    @Override
    public Void visitFunction_call(DaemonScriptParser.Function_callContext ctx) {
        return null;
    }
}
