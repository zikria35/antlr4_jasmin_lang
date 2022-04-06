package CodeGenerator;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import ANTLR.*;

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

        switch ( ctx.op.getText() ) {
            case "<=":  jasminCode.add("if_icmple " + trueLabel); break;
            case ">=":  jasminCode.add("if_icmpge " + trueLabel); break;
            case "<":   jasminCode.add("if_icmplt " + trueLabel); break;
            case ">":   jasminCode.add("if_icmpgt " + trueLabel); break;
            case "==":  jasminCode.add("if_icmpeq " + trueLabel); break;
            case "!=":  jasminCode.add("if_icmpne " + trueLabel); break;
            default:    break;
        }

        return null;
    }

    public Void visitIf_statement(DaemonScriptParser.If_statementContext ctx) {
        visit(ctx.expression());

        String trueLabel = ("ternary" + numTernary);
        String endLabel = ("ternaryEnd" + numTernary);

        if (ctx.falseVal != null){
            visit(ctx.falseVal);
        }

        jasminCode.add("goto " + endLabel);
        jasminCode.add(trueLabel + ":");
        visit(ctx.trueVal);
        jasminCode.add(endLabel + ":");

        return null;
    }

}
