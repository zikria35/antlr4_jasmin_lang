// Generated from C:/Users/Zikiria/Desktop/School Saxion/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaemonScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, OBJ_TYPE=3, LIST=4, BOOLEAN=5, TEXT=6, NUMBER=7, VOID=8, 
		ARGS=9, THEN=10, IF=11, ELSE=12, WHILE=13, TRUE=14, FALSE=15, OR=16, AND=17, 
		EQ=18, NEQ=19, GT=20, LT=21, GTEQ=22, LTEQ=23, PLUS=24, MINUS=25, MULT=26, 
		DIV=27, MOD=28, NOT=29, NULL=30, CONSOLE=31, PRINT=32, SCANINT=33, SCANSTRING=34, 
		POINT=35, ID=36, SPECIAL_CHAR=37, INT=38, FLOAT=39, DIGITS=40, STRING=41, 
		SEMICOLON=42, COLON=43, PARANTHESE_START=44, PARANTHESE_END=45, BRACKET_START=46, 
		BRACKET_END=47, EQUALS=48, BRACE_START=49, BRACE_END=50, COMMA=51, WS=52, 
		COMMENT=53;
	public static final int
		RULE_app = 0, RULE_program = 1, RULE_main = 2, RULE_functions = 3, RULE_statement = 4, 
		RULE_arguments = 5, RULE_array = 6, RULE_console_print = 7, RULE_console_scan_string = 8, 
		RULE_console_scan_int = 9, RULE_declaration_array = 10, RULE_declaration = 11, 
		RULE_return_statement = 12, RULE_function_call = 13, RULE_function_declaration = 14, 
		RULE_assignment = 15, RULE_while_statement = 16, RULE_statement_block = 17, 
		RULE_if_statement = 18, RULE_block = 19, RULE_expression = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "program", "main", "functions", "statement", "arguments", "array", 
			"console_print", "console_scan_string", "console_scan_int", "declaration_array", 
			"declaration", "return_statement", "function_call", "function_declaration", 
			"assignment", "while_statement", "statement_block", "if_statement", "block", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Main'", "'return'", null, "'List'", "'Boolean'", "'Text'", "'Number'", 
			"'Void'", "'args'", "'then'", "'if'", "'else'", "'while'", "'true'", 
			"'false'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'null'", "'console'", "'print'", 
			"'scanNumber'", "'scanText'", "'.'", null, null, null, null, null, null, 
			"';'", "':'", "'('", "')'", "'['", "']'", "'='", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "OBJ_TYPE", "LIST", "BOOLEAN", "TEXT", "NUMBER", 
			"VOID", "ARGS", "THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", 
			"AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NOT", "NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", 
			"POINT", "ID", "SPECIAL_CHAR", "INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", 
			"COLON", "PARANTHESE_START", "PARANTHESE_END", "BRACKET_START", "BRACKET_END", 
			"EQUALS", "BRACE_START", "BRACE_END", "COMMA", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DaemonScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DaemonScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AppContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DaemonScriptParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			main();
			setState(45);
			functions();
			setState(46);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(DaemonScriptParser.MAIN, 0); }
		public TerminalNode BRACKET_START() { return getToken(DaemonScriptParser.BRACKET_START, 0); }
		public TerminalNode BRACKET_END() { return getToken(DaemonScriptParser.BRACKET_END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(MAIN);
			setState(49);
			match(BRACKET_START);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << OBJ_TYPE) | (1L << LIST) | (1L << IF) | (1L << WHILE) | (1L << CONSOLE) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(BRACKET_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << OBJ_TYPE) | (1L << LIST) | (1L << IF) | (1L << WHILE) | (1L << CONSOLE) | (1L << ID))) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Declaration_arrayContext declaration_array() {
			return getRuleContext(Declaration_arrayContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Console_printContext console_print() {
			return getRuleContext(Console_printContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				declaration_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				console_print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				function_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				return_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaemonScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaemonScriptParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			expression(0);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				expression(0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_START() { return getToken(DaemonScriptParser.BRACKET_START, 0); }
		public TerminalNode BRACKET_END() { return getToken(DaemonScriptParser.BRACKET_END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaemonScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaemonScriptParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BRACKET_START);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(84);
				expression(0);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(85);
					match(COMMA);
					setState(86);
					expression(0);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94);
			match(BRACKET_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Console_printContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(DaemonScriptParser.CONSOLE, 0); }
		public TerminalNode POINT() { return getToken(DaemonScriptParser.POINT, 0); }
		public TerminalNode PRINT() { return getToken(DaemonScriptParser.PRINT, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Console_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterConsole_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitConsole_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitConsole_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Console_printContext console_print() throws RecognitionException {
		Console_printContext _localctx = new Console_printContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_console_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CONSOLE);
			setState(97);
			match(POINT);
			setState(98);
			match(PRINT);
			setState(99);
			match(PARANTHESE_START);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(100);
				expression(0);
				}
			}

			setState(103);
			match(PARANTHESE_END);
			setState(104);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Console_scan_stringContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(DaemonScriptParser.CONSOLE, 0); }
		public TerminalNode POINT() { return getToken(DaemonScriptParser.POINT, 0); }
		public TerminalNode SCANSTRING() { return getToken(DaemonScriptParser.SCANSTRING, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public Console_scan_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_scan_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterConsole_scan_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitConsole_scan_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitConsole_scan_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Console_scan_stringContext console_scan_string() throws RecognitionException {
		Console_scan_stringContext _localctx = new Console_scan_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_console_scan_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CONSOLE);
			setState(107);
			match(POINT);
			setState(108);
			match(SCANSTRING);
			setState(109);
			match(PARANTHESE_START);
			setState(110);
			match(PARANTHESE_END);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Console_scan_intContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(DaemonScriptParser.CONSOLE, 0); }
		public TerminalNode POINT() { return getToken(DaemonScriptParser.POINT, 0); }
		public TerminalNode SCANINT() { return getToken(DaemonScriptParser.SCANINT, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public Console_scan_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_scan_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterConsole_scan_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitConsole_scan_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitConsole_scan_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Console_scan_intContext console_scan_int() throws RecognitionException {
		Console_scan_intContext _localctx = new Console_scan_intContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_console_scan_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CONSOLE);
			setState(115);
			match(POINT);
			setState(116);
			match(SCANINT);
			setState(117);
			match(PARANTHESE_START);
			setState(118);
			match(PARANTHESE_END);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(119);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_arrayContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(DaemonScriptParser.LIST, 0); }
		public TerminalNode LT() { return getToken(DaemonScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(DaemonScriptParser.GT, 0); }
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public TerminalNode OBJ_TYPE() { return getToken(DaemonScriptParser.OBJ_TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(DaemonScriptParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterDeclaration_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitDeclaration_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitDeclaration_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_arrayContext declaration_array() throws RecognitionException {
		Declaration_arrayContext _localctx = new Declaration_arrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LIST);
			setState(123);
			match(LT);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJ_TYPE) {
				{
				setState(124);
				match(OBJ_TYPE);
				}
			}

			setState(127);
			match(GT);
			setState(128);
			match(ID);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(129);
				match(EQUALS);
				setState(130);
				expression(0);
				}
			}

			setState(133);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode OBJ_TYPE() { return getToken(DaemonScriptParser.OBJ_TYPE, 0); }
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(OBJ_TYPE);
			setState(136);
			match(ID);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(137);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DaemonScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(RETURN);
			setState(141);
			expression(0);
			setState(142);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DaemonScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DaemonScriptParser.ID, i);
		}
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode POINT() { return getToken(DaemonScriptParser.POINT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(144);
				match(ID);
				setState(145);
				match(POINT);
				}
				break;
			}
			setState(148);
			match(ID);
			setState(149);
			match(PARANTHESE_START);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(150);
				arguments();
				}
			}

			setState(153);
			match(PARANTHESE_END);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(154);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode OBJ_TYPE() { return getToken(DaemonScriptParser.OBJ_TYPE, 0); }
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaemonScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaemonScriptParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OBJ_TYPE);
			setState(158);
			match(ID);
			setState(159);
			match(PARANTHESE_START);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJ_TYPE) {
				{
				setState(160);
				declaration();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(161);
					match(COMMA);
					setState(162);
					declaration();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
			match(PARANTHESE_END);
			setState(171);
			statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DaemonScriptParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			match(EQUALS);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(175);
				expression(0);
				}
				break;
			case 2:
				{
				setState(176);
				function_call();
				}
				break;
			}
			setState(179);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DaemonScriptParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			expression(0);
			setState(183);
			statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public TerminalNode BRACKET_START() { return getToken(DaemonScriptParser.BRACKET_START, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BRACKET_END() { return getToken(DaemonScriptParser.BRACKET_END, 0); }
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(BRACKET_START);
			setState(186);
			block();
			setState(187);
			match(BRACKET_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Statement_blockContext trueVal;
		public Statement_blockContext falseVal;
		public TerminalNode IF() { return getToken(DaemonScriptParser.IF, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode THEN() { return getToken(DaemonScriptParser.THEN, 0); }
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DaemonScriptParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			match(PARANTHESE_START);
			setState(191);
			expression(0);
			setState(192);
			match(PARANTHESE_END);
			setState(193);
			match(THEN);
			setState(194);
			((If_statementContext)_localctx).trueVal = statement_block();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(195);
				match(ELSE);
				setState(196);
				((If_statementContext)_localctx).falseVal = statement_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					statement();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(205);
				return_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExAdditiveContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DaemonScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DaemonScriptParser.MINUS, 0); }
		public ExAdditiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExAdditive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(DaemonScriptParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMultiplyContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(DaemonScriptParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(DaemonScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DaemonScriptParser.MOD, 0); }
		public ExMultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DaemonScriptParser.AND, 0); }
		public ExAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExConsoleScanIntContext extends ExpressionContext {
		public Console_scan_intContext console_scan_int() {
			return getRuleContext(Console_scan_intContext.class,0);
		}
		public ExConsoleScanIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExConsoleScanInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExConsoleScanInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExConsoleScanInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParContext extends ExpressionContext {
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public ExParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomIdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public AtomIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterAtomId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitAtomId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitAtomId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(DaemonScriptParser.STRING, 0); }
		public AtomStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitAtomString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomBooleanContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(DaemonScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DaemonScriptParser.FALSE, 0); }
		public AtomBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterAtomBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitAtomBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitAtomBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomNumberContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(DaemonScriptParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DaemonScriptParser.FLOAT, 0); }
		public AtomNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterAtomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitAtomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(DaemonScriptParser.OR, 0); }
		public ExOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExFunction_CallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExFunction_CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExFunction_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExFunction_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExFunction_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExConsoleScanStringContext extends ExpressionContext {
		public Console_scan_stringContext console_scan_string() {
			return getRuleContext(Console_scan_stringContext.class,0);
		}
		public ExConsoleScanStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExConsoleScanString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExConsoleScanString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExConsoleScanString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExArrayContext extends ExpressionContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMinusContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(DaemonScriptParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExRelationalContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(DaemonScriptParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(DaemonScriptParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(DaemonScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(DaemonScriptParser.GT, 0); }
		public TerminalNode EQ() { return getToken(DaemonScriptParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DaemonScriptParser.NEQ, 0); }
		public ExRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ExMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(209);
				match(MINUS);
				setState(210);
				expression(16);
				}
				break;
			case 2:
				{
				_localctx = new ExNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(NOT);
				setState(212);
				expression(15);
				}
				break;
			case 3:
				{
				_localctx = new ExConsoleScanStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				console_scan_string();
				}
				break;
			case 4:
				{
				_localctx = new ExConsoleScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				console_scan_int();
				}
				break;
			case 5:
				{
				_localctx = new ExFunction_CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				function_call();
				}
				break;
			case 6:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				array();
				}
				break;
			case 7:
				{
				_localctx = new ExParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(PARANTHESE_START);
				setState(218);
				expression(0);
				setState(219);
				match(PARANTHESE_END);
				}
				break;
			case 8:
				{
				_localctx = new AtomNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new AtomBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 10:
				{
				_localctx = new AtomIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new AtomStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExMultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(228);
						((ExMultiplyContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExMultiplyContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						((ExAdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExAdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExRelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						((ExRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((ExRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						match(AND);
						setState(238);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						match(OR);
						setState(241);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\5\7\5>\n\5\f\5\16\5A\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\7\7Q\n\7\f\7\16"+
		"\7T\13\7\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\5\b_\n\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\th\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\5\f\u0080\n\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0086\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\17\5\17\u009a\n\17"+
		"\3\17\3\17\5\17\u009e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a6\n"+
		"\20\f\20\16\20\u00a9\13\20\5\20\u00ab\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c8\n\24\3\25\7\25"+
		"\u00cb\n\25\f\25\16\25\u00ce\13\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00e4\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00f5\n\26\f\26\16\26\u00f8\13\26\3\26\2\3*"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2()\3\2\20\21"+
		"\3\2\34\36\3\2\32\33\3\2\24\31\2\u010f\2,\3\2\2\2\4.\3\2\2\2\6\62\3\2"+
		"\2\2\b?\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16U\3\2\2\2\20b\3\2\2\2\22l\3\2"+
		"\2\2\24t\3\2\2\2\26|\3\2\2\2\30\u0089\3\2\2\2\32\u008e\3\2\2\2\34\u0094"+
		"\3\2\2\2\36\u009f\3\2\2\2 \u00af\3\2\2\2\"\u00b7\3\2\2\2$\u00bb\3\2\2"+
		"\2&\u00bf\3\2\2\2(\u00cc\3\2\2\2*\u00e3\3\2\2\2,-\5\4\3\2-\3\3\2\2\2."+
		"/\5\6\4\2/\60\5\b\5\2\60\61\7\2\2\3\61\5\3\2\2\2\62\63\7\3\2\2\63\67\7"+
		"\60\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28:\3\2\2\29\67\3\2\2\2:;\7\61\2\2;\7\3\2\2\2<>\5\n\6\2=<\3\2\2\2>"+
		"A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BL\5\30\r\2CL\5\26\f"+
		"\2DL\5 \21\2EL\5\20\t\2FL\5\"\22\2GL\5&\24\2HL\5\34\17\2IL\5\36\20\2J"+
		"L\5\32\16\2KB\3\2\2\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2"+
		"\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MR\5*\26\2NO\7\65\2\2OQ\5"+
		"*\26\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2U^"+
		"\7\60\2\2V[\5*\26\2WX\7\65\2\2XZ\5*\26\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^V\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\61"+
		"\2\2a\17\3\2\2\2bc\7!\2\2cd\7%\2\2de\7\"\2\2eg\7.\2\2fh\5*\26\2gf\3\2"+
		"\2\2gh\3\2\2\2hi\3\2\2\2ij\7/\2\2jk\7,\2\2k\21\3\2\2\2lm\7!\2\2mn\7%\2"+
		"\2no\7$\2\2op\7.\2\2pr\7/\2\2qs\7,\2\2rq\3\2\2\2rs\3\2\2\2s\23\3\2\2\2"+
		"tu\7!\2\2uv\7%\2\2vw\7#\2\2wx\7.\2\2xz\7/\2\2y{\7,\2\2zy\3\2\2\2z{\3\2"+
		"\2\2{\25\3\2\2\2|}\7\6\2\2}\177\7\27\2\2~\u0080\7\5\2\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\26\2\2\u0082\u0085\7"+
		"&\2\2\u0083\u0084\7\62\2\2\u0084\u0086\5*\26\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7,\2\2\u0088\27\3\2\2\2"+
		"\u0089\u008a\7\5\2\2\u008a\u008c\7&\2\2\u008b\u008d\7,\2\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\7\4\2\2\u008f"+
		"\u0090\5*\26\2\u0090\u0091\7,\2\2\u0091\33\3\2\2\2\u0092\u0093\7&\2\2"+
		"\u0093\u0095\7%\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\7&\2\2\u0097\u0099\7.\2\2\u0098\u009a\5\f\7\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7/"+
		"\2\2\u009c\u009e\7,\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\35\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\7&\2\2\u00a1\u00aa\7.\2\2"+
		"\u00a2\u00a7\5\30\r\2\u00a3\u00a4\7\65\2\2\u00a4\u00a6\5\30\r\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\5$\23"+
		"\2\u00ae\37\3\2\2\2\u00af\u00b0\7&\2\2\u00b0\u00b3\7\62\2\2\u00b1\u00b4"+
		"\5*\26\2\u00b2\u00b4\5\34\17\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6!\3\2\2\2\u00b7\u00b8\7\17"+
		"\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\5$\23\2\u00ba#\3\2\2\2\u00bb\u00bc"+
		"\7\60\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\61\2\2\u00be%\3\2\2\2\u00bf"+
		"\u00c0\7\r\2\2\u00c0\u00c1\7.\2\2\u00c1\u00c2\5*\26\2\u00c2\u00c3\7/\2"+
		"\2\u00c3\u00c4\7\f\2\2\u00c4\u00c7\5$\23\2\u00c5\u00c6\7\16\2\2\u00c6"+
		"\u00c8\5$\23\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\'\3\2\2\2"+
		"\u00c9\u00cb\5\n\6\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\5\32\16\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1)\3\2\2"+
		"\2\u00d2\u00d3\b\26\1\2\u00d3\u00d4\7\33\2\2\u00d4\u00e4\5*\26\22\u00d5"+
		"\u00d6\7\37\2\2\u00d6\u00e4\5*\26\21\u00d7\u00e4\5\22\n\2\u00d8\u00e4"+
		"\5\24\13\2\u00d9\u00e4\5\34\17\2\u00da\u00e4\5\16\b\2\u00db\u00dc\7.\2"+
		"\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7/\2\2\u00de\u00e4\3\2\2\2\u00df\u00e4"+
		"\t\2\2\2\u00e0\u00e4\t\3\2\2\u00e1\u00e4\7&\2\2\u00e2\u00e4\7+\2\2\u00e3"+
		"\u00d2\3\2\2\2\u00e3\u00d5\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00d8\3\2"+
		"\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00f6\3\2\2\2\u00e5\u00e6\f\20\2\2\u00e6\u00e7\t\4\2\2\u00e7"+
		"\u00f5\5*\26\21\u00e8\u00e9\f\17\2\2\u00e9\u00ea\t\5\2\2\u00ea\u00f5\5"+
		"*\26\20\u00eb\u00ec\f\16\2\2\u00ec\u00ed\t\6\2\2\u00ed\u00f5\5*\26\17"+
		"\u00ee\u00ef\f\r\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f5\5*\26\16\u00f1\u00f2"+
		"\f\f\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f5\5*\26\r\u00f4\u00e5\3\2\2\2"+
		"\u00f4\u00e8\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"+\3\2\2\2\u00f8\u00f6\3\2\2\2\32\67?KR[^grz\177\u0085\u008c\u0094\u0099"+
		"\u009d\u00a7\u00aa\u00b3\u00c7\u00cc\u00d0\u00e3\u00f4\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}