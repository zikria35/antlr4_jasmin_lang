// Generated from C:/Users/zikri/Desktop/School Saxion/compilers and operatingsystems/final/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DaemonScriptParser}.
 */
public interface DaemonScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(DaemonScriptParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(DaemonScriptParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DaemonScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DaemonScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(DaemonScriptParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(DaemonScriptParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DaemonScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DaemonScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(DaemonScriptParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(DaemonScriptParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(DaemonScriptParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(DaemonScriptParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DaemonScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DaemonScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DaemonScriptParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DaemonScriptParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#console_print}.
	 * @param ctx the parse tree
	 */
	void enterConsole_print(DaemonScriptParser.Console_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#console_print}.
	 * @param ctx the parse tree
	 */
	void exitConsole_print(DaemonScriptParser.Console_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#console_scan_string}.
	 * @param ctx the parse tree
	 */
	void enterConsole_scan_string(DaemonScriptParser.Console_scan_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#console_scan_string}.
	 * @param ctx the parse tree
	 */
	void exitConsole_scan_string(DaemonScriptParser.Console_scan_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#console_scan_int}.
	 * @param ctx the parse tree
	 */
	void enterConsole_scan_int(DaemonScriptParser.Console_scan_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#console_scan_int}.
	 * @param ctx the parse tree
	 */
	void exitConsole_scan_int(DaemonScriptParser.Console_scan_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#declaration_array}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_array(DaemonScriptParser.Declaration_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#declaration_array}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_array(DaemonScriptParser.Declaration_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DaemonScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DaemonScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DaemonScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DaemonScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(DaemonScriptParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DaemonScriptParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(DaemonScriptParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(DaemonScriptParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(DaemonScriptParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(DaemonScriptParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(DaemonScriptParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(DaemonScriptParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DaemonScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DaemonScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExAdditive}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExAdditive(DaemonScriptParser.ExAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExAdditive}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExAdditive(DaemonScriptParser.ExAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExNot}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExNot(DaemonScriptParser.ExNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExNot}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExNot(DaemonScriptParser.ExNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExMultiply}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExMultiply(DaemonScriptParser.ExMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExMultiply}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExMultiply(DaemonScriptParser.ExMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExFunctionDeclaration}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExFunctionDeclaration(DaemonScriptParser.ExFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExFunctionDeclaration}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExFunctionDeclaration(DaemonScriptParser.ExFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExAnd}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExAnd(DaemonScriptParser.ExAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExAnd}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExAnd(DaemonScriptParser.ExAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExConsoleScanInt}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExConsoleScanInt(DaemonScriptParser.ExConsoleScanIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExConsoleScanInt}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExConsoleScanInt(DaemonScriptParser.ExConsoleScanIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExPar}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExPar(DaemonScriptParser.ExParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExPar}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExPar(DaemonScriptParser.ExParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomId(DaemonScriptParser.AtomIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomId}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomId(DaemonScriptParser.AtomIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(DaemonScriptParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(DaemonScriptParser.AtomStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomBoolean}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomBoolean(DaemonScriptParser.AtomBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomBoolean}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomBoolean(DaemonScriptParser.AtomBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumber(DaemonScriptParser.AtomNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumber(DaemonScriptParser.AtomNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExEqual}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExEqual(DaemonScriptParser.ExEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExEqual}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExEqual(DaemonScriptParser.ExEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExFunctionCall}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExFunctionCall(DaemonScriptParser.ExFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExFunctionCall}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExFunctionCall(DaemonScriptParser.ExFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExOr}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExOr(DaemonScriptParser.ExOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExOr}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExOr(DaemonScriptParser.ExOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExConsoleScanString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExConsoleScanString(DaemonScriptParser.ExConsoleScanStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExConsoleScanString}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExConsoleScanString(DaemonScriptParser.ExConsoleScanStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExArray(DaemonScriptParser.ExArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExArray}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExArray(DaemonScriptParser.ExArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExMinus}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExMinus(DaemonScriptParser.ExMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExMinus}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExMinus(DaemonScriptParser.ExMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExRelational}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExRelational(DaemonScriptParser.ExRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExRelational}
	 * labeled alternative in {@link DaemonScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExRelational(DaemonScriptParser.ExRelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaemonScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(DaemonScriptParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaemonScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(DaemonScriptParser.AtomContext ctx);
}