// Generated from C:/Users/Zikiria/Desktop/School Saxion/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DaemonScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DaemonScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(DaemonScriptParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DaemonScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(DaemonScriptParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(DaemonScriptParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DaemonScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(DaemonScriptParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(DaemonScriptParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DaemonScriptParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(DaemonScriptParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#console_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsole_print(DaemonScriptParser.Console_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#console_scan_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsole_scan_string(DaemonScriptParser.Console_scan_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#console_scan_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsole_scan_int(DaemonScriptParser.Console_scan_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#declaration_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_array(DaemonScriptParser.Declaration_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DaemonScriptParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DaemonScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(DaemonScriptParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(DaemonScriptParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(DaemonScriptParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaemonScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DaemonScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAdditive}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAdditive(DaemonScriptParser.ExAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNot}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNot(DaemonScriptParser.ExNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMultiply}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMultiply(DaemonScriptParser.ExMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAnd}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAnd(DaemonScriptParser.ExAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExConsoleScanInt}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExConsoleScanInt(DaemonScriptParser.ExConsoleScanIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExPar}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExPar(DaemonScriptParser.ExParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomId(DaemonScriptParser.AtomIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(DaemonScriptParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomBoolean}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomBoolean(DaemonScriptParser.AtomBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(DaemonScriptParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExOr}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExOr(DaemonScriptParser.ExOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExConsoleScanString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExConsoleScanString(DaemonScriptParser.ExConsoleScanStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExArray(DaemonScriptParser.ExArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMinus}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMinus(DaemonScriptParser.ExMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExRelational}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExRelational(DaemonScriptParser.ExRelationalContext ctx);
}