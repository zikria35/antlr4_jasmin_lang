package CodeGenerator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import ANTLR.*;
import org.w3c.dom.Text;

import java.util.HashMap;

public class Checker extends DaemonScriptBaseVisitor<DataType>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private Scope currentScope = new Scope();
    private int numLocals = 0;
  //  private HashMap<String, String> functions;

    public Checker( ParseTreeProperty<DataType> types,
                    ParseTreeProperty<Symbol> symbols ) {
        this.types = types;
        this.symbols = symbols;
    }

    @Override
    public DataType visitMain(DaemonScriptParser.MainContext ctx) {
        currentScope = currentScope.openScope();
        numLocals = 0;
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitAtomString(DaemonScriptParser.AtomStringContext ctx) {
        return addType( ctx, DataType.STRING );
    }

    @Override
    public DataType visitAtomNumber(DaemonScriptParser.AtomNumberContext ctx) {
        return addType( ctx, DataType.INT );
    }

    @Override
    public DataType visitExMinus(DaemonScriptParser.ExMinusContext ctx) {
        DataType subtype = visit(ctx.expression());
        return addType( ctx, subtype );
    }

    @Override
    public DataType visitExPar(DaemonScriptParser.ExParContext ctx) {
        DataType subtype = visit(ctx.expression());
        return addType( ctx, subtype );
    }

    @Override
    public DataType visitExMultiply(DaemonScriptParser.ExMultiplyContext ctx) {
        DataType leftType = visit(ctx.expression(0));
        DataType rightType = visit(ctx.expression(1));
        if( leftType != rightType )
            throw new CompilerException("Left and right type are not the same!");
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitExAdditive(DaemonScriptParser.ExAdditiveContext ctx) {
        DataType leftType = visit(ctx.expression(0));
        DataType rightType = visit(ctx.expression(1));
        if( leftType != rightType )
            throw new CompilerException("Left and right type are not the same!");
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitFunction_declaration(DaemonScriptParser.Function_declarationContext ctx) {
        currentScope = currentScope.openScope();
        numLocals = -1;
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    @Override
    public DataType visitDeclaration(DaemonScriptParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        DataType varType = switch (ctx.OBJ_TYPE().toString()) {
            case "Number" -> DataType.INT;
            case "Boolean" -> DataType.BOOLEAN;
            case "List" -> DataType.LIST;
            case "Void" -> DataType.VOID;
            default -> DataType.STRING;
        };

        //Check if declaration is inside of a Function declaration
        numLocals++;

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new CompilerException("Already declared variable called " + varName);

        currentScope.declareVariable(new Symbol(varName, varType, numLocals));
        return null;
    }



    @Override
    public DataType visitAssignment(DaemonScriptParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new CompilerException("Undefined variable in assignment: " + varName);

        DataType expressionType = visit(ctx.expression());
        if (expressionType == null) {
            if (ctx.expression().getRuleContext().getClass().equals(DaemonScriptParser.ExConsoleScanIntContext.class)){
                //Int Scanner
                expressionType = DataType.INT;
            } else {
                //String Scanner
                expressionType = DataType.STRING;
            }
        }
        if( s.getType() != expressionType && !ctx.expression().getRuleContext().getPayload().getClass().equals(DaemonScriptParser.ExFunction_CallContext.class)){
            throw new CompilerException("Assignment type is not correct");
        }

        symbols.put(ctx, s);
        return null;
    }

    @Override
    public DataType visitAtomId(DaemonScriptParser.AtomIdContext ctx) {
        Symbol s = currentScope.lookupVariable(ctx.getText());
        if( s == null )
            throw new CompilerException("Undefined variable: " + ctx.getText());

        symbols.put(ctx, s);
        types.put(ctx, s.getType());
        return s.getType();
    }

    @Override
    public DataType visitBlock(DaemonScriptParser.BlockContext ctx) {
        currentScope = currentScope.openScope();
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}
