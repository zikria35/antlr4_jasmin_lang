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
		T__0=1, LIST=2, BOOLEAN=3, TEXT=4, NUMBER=5, MAIN=6, OBJ_TYPE=7, ARGS=8, 
		THEN=9, IF=10, ELSE=11, WHILE=12, TRUE=13, FALSE=14, OR=15, AND=16, EQ=17, 
		NEQ=18, GT=19, LT=20, GTEQ=21, LTEQ=22, PLUS=23, MINUS=24, MULT=25, DIV=26, 
		MOD=27, NOT=28, NULL=29, CONSOLE=30, PRINT=31, SCANINT=32, SCANSTRING=33, 
		POINT=34, ID=35, SPECIAL_CHAR=36, INT=37, FLOAT=38, DIGITS=39, STRING=40, 
		SEMICOLON=41, COLON=42, PARANTHESE_START=43, PARANTHESE_END=44, BRACKET_START=45, 
		BRACKET_END=46, EQUALS=47, BRACE_START=48, BRACE_END=49, COMMA=50, WS=51, 
		COMMENT=52;
	public static final int
		RULE_app = 0, RULE_program = 1, RULE_main = 2, RULE_functions = 3, RULE_statement = 4, 
		RULE_function_call = 5, RULE_function_declaration = 6, RULE_arguments = 7, 
		RULE_array = 8, RULE_console_print = 9, RULE_console_scan_string = 10, 
		RULE_console_scan_int = 11, RULE_declaration_array = 12, RULE_declaration = 13, 
		RULE_assignment = 14, RULE_while_statement = 15, RULE_statement_block = 16, 
		RULE_if_statement = 17, RULE_block = 18, RULE_expression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "program", "main", "functions", "statement", "function_call", 
			"function_declaration", "arguments", "array", "console_print", "console_scan_string", 
			"console_scan_int", "declaration_array", "declaration", "assignment", 
			"while_statement", "statement_block", "if_statement", "block", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'List'", "'Boolean'", "'Text'", "'Number'", "'Main'", 
			null, "'args'", "'then'", "'if'", "'else'", "'while'", "'true'", "'false'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'null'", "'console'", "'print'", 
			"'scanNumber'", "'scanText'", "'.'", null, null, null, null, null, null, 
			"';'", "':'", "'('", "')'", "'['", "']'", "'='", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LIST", "BOOLEAN", "TEXT", "NUMBER", "MAIN", "OBJ_TYPE", 
			"ARGS", "THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "NOT", "NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", 
			"ID", "SPECIAL_CHAR", "INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", 
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
			setState(40);
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
			setState(42);
			main();
			setState(43);
			functions();
			setState(44);
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
			setState(46);
			match(MAIN);
			setState(47);
			match(BRACKET_START);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				declaration_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				console_print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				if_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				function_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				function_declaration();
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
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				match(ID);
				setState(74);
				match(POINT);
				}
				break;
			}
			setState(77);
			match(ID);
			setState(78);
			match(PARANTHESE_START);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(79);
				arguments();
				}
			}

			setState(82);
			match(PARANTHESE_END);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(83);
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
		public List<TerminalNode> ID() { return getTokens(DaemonScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DaemonScriptParser.ID, i);
		}
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(DaemonScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DaemonScriptParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(DaemonScriptParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DaemonScriptParser.TEXT, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(DaemonScriptParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(DaemonScriptParser.BOOLEAN, i);
		}
		public List<TerminalNode> LIST() { return getTokens(DaemonScriptParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(DaemonScriptParser.LIST, i);
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
		enterRule(_localctx, 12, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(PARANTHESE_START);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) {
				{
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(92);
					match(ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(PARANTHESE_END);
			setState(101);
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
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expression(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				expression(0);
				}
				}
				setState(110);
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
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(BRACKET_START);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(112);
				expression(0);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					expression(0);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(122);
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
		enterRule(_localctx, 18, RULE_console_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CONSOLE);
			setState(125);
			match(POINT);
			setState(126);
			match(PRINT);
			setState(127);
			match(PARANTHESE_START);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(128);
				expression(0);
				}
			}

			setState(131);
			match(PARANTHESE_END);
			setState(132);
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
		enterRule(_localctx, 20, RULE_console_scan_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CONSOLE);
			setState(135);
			match(POINT);
			setState(136);
			match(SCANSTRING);
			setState(137);
			match(PARANTHESE_START);
			setState(138);
			match(PARANTHESE_END);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(139);
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
		enterRule(_localctx, 22, RULE_console_scan_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CONSOLE);
			setState(143);
			match(POINT);
			setState(144);
			match(SCANINT);
			setState(145);
			match(PARANTHESE_START);
			setState(146);
			match(PARANTHESE_END);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(147);
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
		public List<TerminalNode> LIST() { return getTokens(DaemonScriptParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(DaemonScriptParser.LIST, i);
		}
		public TerminalNode LT() { return getToken(DaemonScriptParser.LT, 0); }
		public TerminalNode GT() { return getToken(DaemonScriptParser.GT, 0); }
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(DaemonScriptParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DaemonScriptParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(DaemonScriptParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DaemonScriptParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 24, RULE_declaration_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LIST);
			setState(151);
			match(LT);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) {
				{
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(155);
			match(GT);
			setState(156);
			match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(157);
				match(EQUALS);
				setState(158);
				expression(0);
				}
			}

			setState(161);
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
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(DaemonScriptParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(DaemonScriptParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(DaemonScriptParser.BOOLEAN, 0); }
		public TerminalNode LIST() { return getToken(DaemonScriptParser.LIST, 0); }
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
		enterRule(_localctx, 26, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			match(ID);
			setState(165);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(EQUALS);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(169);
				expression(0);
				}
				break;
			case 2:
				{
				setState(170);
				function_call();
				}
				break;
			}
			setState(173);
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
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WHILE);
			setState(176);
			expression(0);
			setState(177);
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
		enterRule(_localctx, 32, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(BRACKET_START);
			setState(180);
			block();
			setState(181);
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
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IF);
			setState(184);
			match(PARANTHESE_START);
			setState(185);
			expression(0);
			setState(186);
			match(PARANTHESE_END);
			setState(187);
			match(THEN);
			setState(188);
			((If_statementContext)_localctx).trueVal = statement_block();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(189);
				match(ELSE);
				setState(190);
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
		public TerminalNode ID() { return getToken(DaemonScriptParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				{
				setState(193);
				statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(199);
				match(T__0);
				setState(200);
				match(ID);
				setState(201);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ExMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				match(MINUS);
				setState(206);
				expression(15);
				}
				break;
			case 2:
				{
				_localctx = new ExNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(NOT);
				setState(208);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new ExConsoleScanStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				console_scan_string();
				}
				break;
			case 4:
				{
				_localctx = new ExConsoleScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				console_scan_int();
				}
				break;
			case 5:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				array();
				}
				break;
			case 6:
				{
				_localctx = new ExParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(PARANTHESE_START);
				setState(213);
				expression(0);
				setState(214);
				match(PARANTHESE_END);
				}
				break;
			case 7:
				{
				_localctx = new AtomNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
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
			case 8:
				{
				_localctx = new AtomBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
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
			case 9:
				{
				_localctx = new AtomIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new AtomStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExMultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(223);
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
						setState(224);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226);
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
						setState(227);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExRelationalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229);
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
						setState(230);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						match(AND);
						setState(233);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(235);
						match(OR);
						setState(236);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\4\3\4\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\5\7N\n\7\3\7\3\7\3\7\5\7S"+
		"\n\7\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13"+
		"\b\5\be\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3"+
		"\n\3\n\7\nv\n\n\f\n\16\ny\13\n\5\n{\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0084\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\5\16\u009c\n\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00ae\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\24"+
		"\7\24\u00c5\n\24\f\24\16\24\u00c8\13\24\3\24\3\24\3\24\5\24\u00cd\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00df\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25"+
		"\3\25\2\3(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\4\7"+
		"\3\2\'(\3\2\17\20\3\2\33\35\3\2\31\32\3\2\23\30\2\u0109\2*\3\2\2\2\4,"+
		"\3\2\2\2\6\60\3\2\2\2\b=\3\2\2\2\nI\3\2\2\2\fM\3\2\2\2\16X\3\2\2\2\20"+
		"i\3\2\2\2\22q\3\2\2\2\24~\3\2\2\2\26\u0088\3\2\2\2\30\u0090\3\2\2\2\32"+
		"\u0098\3\2\2\2\34\u00a5\3\2\2\2\36\u00a9\3\2\2\2 \u00b1\3\2\2\2\"\u00b5"+
		"\3\2\2\2$\u00b9\3\2\2\2&\u00c6\3\2\2\2(\u00de\3\2\2\2*+\5\4\3\2+\3\3\2"+
		"\2\2,-\5\6\4\2-.\5\b\5\2./\7\2\2\3/\5\3\2\2\2\60\61\7\b\2\2\61\65\7/\2"+
		"\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\65\3\2\2\289\7\60\2\29\7\3\2\2\2:<\5\n\6\2;:\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2@J\5(\25\2AJ\5\34\17"+
		"\2BJ\5\32\16\2CJ\5\36\20\2DJ\5\24\13\2EJ\5 \21\2FJ\5$\23\2GJ\5\f\7\2H"+
		"J\5\16\b\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2"+
		"IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KL\7%\2\2LN\7$\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NO\3\2\2\2OP\7%\2\2PR\7-\2\2QS\5\20\t\2RQ\3\2\2\2RS\3\2\2\2"+
		"ST\3\2\2\2TV\7.\2\2UW\7+\2\2VU\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XY\7%\2\2Y"+
		"d\7-\2\2Z[\t\2\2\2[a\7%\2\2\\]\7\64\2\2]^\t\2\2\2^`\7%\2\2_\\\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2dZ\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fg\7.\2\2gh\5\"\22\2h\17\3\2\2\2in\5(\25\2jk\7\64\2\2km\5(\25"+
		"\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2pn\3\2\2\2qz\7/"+
		"\2\2rw\5(\25\2st\7\64\2\2tv\5(\25\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\60\2\2}\23"+
		"\3\2\2\2~\177\7 \2\2\177\u0080\7$\2\2\u0080\u0081\7!\2\2\u0081\u0083\7"+
		"-\2\2\u0082\u0084\5(\25\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7.\2\2\u0086\u0087\7+\2\2\u0087\25\3\2\2\2"+
		"\u0088\u0089\7 \2\2\u0089\u008a\7$\2\2\u008a\u008b\7#\2\2\u008b\u008c"+
		"\7-\2\2\u008c\u008e\7.\2\2\u008d\u008f\7+\2\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\7$\2\2"+
		"\u0092\u0093\7\"\2\2\u0093\u0094\7-\2\2\u0094\u0096\7.\2\2\u0095\u0097"+
		"\7+\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2\2\u0098"+
		"\u0099\7\4\2\2\u0099\u009b\7\26\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\25\2\2\u009e"+
		"\u00a1\7%\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a2\5(\25\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\7+\2\2"+
		"\u00a8\35\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ad\7\61\2\2\u00ab\u00ae"+
		"\5(\25\2\u00ac\u00ae\5\f\7\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\7\16\2"+
		"\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\5\"\22\2\u00b4!\3\2\2\2\u00b5\u00b6"+
		"\7/\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\7\60\2\2\u00b8#\3\2\2\2\u00b9"+
		"\u00ba\7\f\2\2\u00ba\u00bb\7-\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7.\2"+
		"\2\u00bd\u00be\7\13\2\2\u00be\u00c1\5\"\22\2\u00bf\u00c0\7\r\2\2\u00c0"+
		"\u00c2\5\"\22\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2%\3\2\2\2"+
		"\u00c3\u00c5\5\n\6\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cc\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\3\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cd\7+\2\2\u00cc\u00c9\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\b\25\1\2\u00cf\u00d0"+
		"\7\32\2\2\u00d0\u00df\5(\25\21\u00d1\u00d2\7\36\2\2\u00d2\u00df\5(\25"+
		"\20\u00d3\u00df\5\26\f\2\u00d4\u00df\5\30\r\2\u00d5\u00df\5\22\n\2\u00d6"+
		"\u00d7\7-\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\7.\2\2\u00d9\u00df\3\2\2"+
		"\2\u00da\u00df\t\3\2\2\u00db\u00df\t\4\2\2\u00dc\u00df\7%\2\2\u00dd\u00df"+
		"\7*\2\2\u00de\u00ce\3\2\2\2\u00de\u00d1\3\2\2\2\u00de\u00d3\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00da\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00f1\3\2\2\2\u00e0\u00e1\f\17\2\2\u00e1\u00e2\t\5\2\2\u00e2\u00f0\5"+
		"(\25\20\u00e3\u00e4\f\16\2\2\u00e4\u00e5\t\6\2\2\u00e5\u00f0\5(\25\17"+
		"\u00e6\u00e7\f\r\2\2\u00e7\u00e8\t\7\2\2\u00e8\u00f0\5(\25\16\u00e9\u00ea"+
		"\f\f\2\2\u00ea\u00eb\7\22\2\2\u00eb\u00f0\5(\25\r\u00ec\u00ed\f\13\2\2"+
		"\u00ed\u00ee\7\21\2\2\u00ee\u00f0\5(\25\f\u00ef\u00e0\3\2\2\2\u00ef\u00e3"+
		"\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2)\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\31\65=IMRVadnwz\u0083\u008e\u0096\u009b\u00a1\u00ad"+
		"\u00c1\u00c6\u00cc\u00de\u00ef\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}