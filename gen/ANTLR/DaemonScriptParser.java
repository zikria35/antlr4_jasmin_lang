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
		T__0=1, LIST=2, BOOLEAN=3, TEXT=4, NUMBER=5, OBJ_TYPE=6, ARGS=7, THEN=8, 
		IF=9, ELSE=10, WHILE=11, TRUE=12, FALSE=13, OR=14, AND=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTEQ=20, LTEQ=21, PLUS=22, MINUS=23, MULT=24, DIV=25, MOD=26, 
		NOT=27, NULL=28, CONSOLE=29, PRINT=30, SCANINT=31, SCANSTRING=32, POINT=33, 
		ID=34, SPECIAL_CHAR=35, INT=36, FLOAT=37, DIGITS=38, STRING=39, SEMICOLON=40, 
		COLON=41, PARANTHESE_START=42, PARANTHESE_END=43, BRACKET_START=44, BRACKET_END=45, 
		EQUALS=46, BRACE_START=47, BRACE_END=48, COMMA=49, WS=50, COMMENT=51;
	public static final int
		RULE_app = 0, RULE_program = 1, RULE_main = 2, RULE_statement = 3, RULE_function_call = 4, 
		RULE_function_declaration = 5, RULE_arguments = 6, RULE_array = 7, RULE_console_print = 8, 
		RULE_console_scan_string = 9, RULE_console_scan_int = 10, RULE_declaration_array = 11, 
		RULE_declaration = 12, RULE_assignment = 13, RULE_while_statement = 14, 
		RULE_statement_block = 15, RULE_block = 16, RULE_expression = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "program", "main", "statement", "function_call", "function_declaration", 
			"arguments", "array", "console_print", "console_scan_string", "console_scan_int", 
			"declaration_array", "declaration", "assignment", "while_statement", 
			"statement_block", "block", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Main'", "'List'", "'Boolean'", "'Text'", "'Number'", null, "'args'", 
			"'then'", "'if'", "'else'", "'while'", "'true'", "'false'", "'||'", "'&&'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'null'", "'console'", "'print'", "'scanInt'", "'scanString'", 
			"'.'", null, null, null, null, null, null, "';'", "':'", "'('", "')'", 
			"'['", "']'", "'='", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LIST", "BOOLEAN", "TEXT", "NUMBER", "OBJ_TYPE", "ARGS", 
			"THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", "EQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", 
			"NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", "ID", "SPECIAL_CHAR", 
			"INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", "COLON", "PARANTHESE_START", 
			"PARANTHESE_END", "BRACKET_START", "BRACKET_END", "EQUALS", "BRACE_START", 
			"BRACE_END", "COMMA", "WS", "COMMENT"
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
			setState(36);
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
			setState(38);
			main();
			setState(39);
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
			setState(41);
			match(T__0);
			setState(42);
			match(BRACKET_START);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(BRACKET_END);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				declaration_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				console_print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				while_statement();
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
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(64);
				match(ID);
				setState(65);
				match(POINT);
				}
				break;
			}
			setState(68);
			match(ID);
			setState(69);
			match(PARANTHESE_START);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(70);
				arguments();
				}
			}

			setState(73);
			match(PARANTHESE_END);
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74);
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
		enterRule(_localctx, 10, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(78);
			match(PARANTHESE_START);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) {
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				match(ID);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81);
					match(COMMA);
					setState(82);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(83);
					match(ID);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(91);
			match(PARANTHESE_END);
			setState(92);
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
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			expression(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				expression(0);
				}
				}
				setState(101);
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
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(BRACKET_START);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
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

			setState(113);
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
		enterRule(_localctx, 16, RULE_console_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CONSOLE);
			setState(116);
			match(POINT);
			setState(117);
			match(PRINT);
			setState(118);
			match(PARANTHESE_START);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				setState(119);
				expression(0);
				}
			}

			setState(122);
			match(PARANTHESE_END);
			setState(123);
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
		enterRule(_localctx, 18, RULE_console_scan_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONSOLE);
			setState(126);
			match(POINT);
			setState(127);
			match(SCANSTRING);
			setState(128);
			match(PARANTHESE_START);
			setState(129);
			match(PARANTHESE_END);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(130);
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
		enterRule(_localctx, 20, RULE_console_scan_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CONSOLE);
			setState(134);
			match(POINT);
			setState(135);
			match(SCANINT);
			setState(136);
			match(PARANTHESE_START);
			setState(137);
			match(PARANTHESE_END);
			setState(138);
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
		enterRule(_localctx, 22, RULE_declaration_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LIST);
			setState(141);
			match(LT);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) {
				{
				setState(142);
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

			setState(145);
			match(GT);
			setState(146);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(147);
				match(EQUALS);
				setState(148);
				expression(0);
				}
			}

			setState(151);
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
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			match(ID);
			setState(155);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DaemonScriptParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			match(EQUALS);
			setState(159);
			expression(0);
			setState(160);
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
		enterRule(_localctx, 28, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			expression(0);
			setState(164);
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
		enterRule(_localctx, 30, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(BRACKET_START);
			setState(167);
			block();
			setState(168);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << BOOLEAN) | (1L << TEXT) | (1L << NUMBER) | (1L << IF) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << CONSOLE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << PARANTHESE_START) | (1L << BRACKET_START))) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
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
	public static class ExFunctionDeclarationContext extends ExpressionContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public ExFunctionDeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExFunctionDeclaration(this);
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
	public static class ExFunctionCallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).enterExFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaemonScriptListener ) ((DaemonScriptListener)listener).exitExFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaemonScriptVisitor ) return ((DaemonScriptVisitor<? extends T>)visitor).visitExFunctionCall(this);
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
		public Statement_blockContext trueVal;
		public Statement_blockContext falseVal;
		public TerminalNode IF() { return getToken(DaemonScriptParser.IF, 0); }
		public TerminalNode PARANTHESE_START() { return getToken(DaemonScriptParser.PARANTHESE_START, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARANTHESE_END() { return getToken(DaemonScriptParser.PARANTHESE_END, 0); }
		public TerminalNode THEN() { return getToken(DaemonScriptParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(DaemonScriptParser.ELSE, 0); }
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ExMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(MINUS);
				setState(178);
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new ExNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(NOT);
				setState(180);
				expression(16);
				}
				break;
			case 3:
				{
				_localctx = new ExRelationalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(IF);
				setState(182);
				match(PARANTHESE_START);
				setState(183);
				expression(0);
				setState(184);
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
				setState(185);
				expression(0);
				setState(186);
				match(PARANTHESE_END);
				setState(187);
				match(THEN);
				setState(188);
				((ExRelationalContext)_localctx).trueVal = statement_block();
				setState(189);
				match(ELSE);
				setState(190);
				((ExRelationalContext)_localctx).falseVal = statement_block();
				}
				break;
			case 4:
				{
				_localctx = new ExArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				array();
				}
				break;
			case 5:
				{
				_localctx = new ExFunctionDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				function_declaration();
				}
				break;
			case 6:
				{
				_localctx = new ExFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				function_call();
				}
				break;
			case 7:
				{
				_localctx = new ExConsoleScanStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				console_scan_string();
				}
				break;
			case 8:
				{
				_localctx = new ExConsoleScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				console_scan_int();
				}
				break;
			case 9:
				{
				_localctx = new ExParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(PARANTHESE_START);
				setState(198);
				expression(0);
				setState(199);
				match(PARANTHESE_END);
				}
				break;
			case 10:
				{
				_localctx = new AtomNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
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
			case 11:
				{
				_localctx = new AtomBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
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
			case 12:
				{
				_localctx = new AtomIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new AtomStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExMultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(208);
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
						setState(209);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExAdditiveContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(211);
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
						setState(212);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(214);
						match(AND);
						setState(215);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(217);
						match(OR);
						setState(218);
						expression(12);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6"+
		"\3\6\5\6E\n\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\5\7\\\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7"+
		"\bd\n\b\f\b\16\bg\13\b\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\5\tr\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0086\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u0092\n\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\7"+
		"\22\u00ae\n\22\f\22\16\22\u00b1\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00de\n\23\f\23"+
		"\16\23\u00e1\13\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\b\3\2\4\7\3\2\22\27\3\2&\'\3\2\16\17\3\2\32\34\3\2\30\31\2\u00f4"+
		"\2&\3\2\2\2\4(\3\2\2\2\6+\3\2\2\2\b@\3\2\2\2\nD\3\2\2\2\fO\3\2\2\2\16"+
		"`\3\2\2\2\20h\3\2\2\2\22u\3\2\2\2\24\177\3\2\2\2\26\u0087\3\2\2\2\30\u008e"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u009f\3\2\2\2\36\u00a4\3\2\2\2 \u00a8\3\2"+
		"\2\2\"\u00af\3\2\2\2$\u00cf\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\5\6\4\2)"+
		"*\7\2\2\3*\5\3\2\2\2+,\7\3\2\2,\60\7.\2\2-/\5\b\5\2.-\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\67\7/\2"+
		"\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"\7\3\2\2\29\67\3\2\2\2:A\5$\23\2;A\5\32\16\2<A\5\30\r\2=A\5\34\17\2>A"+
		"\5\22\n\2?A\5\36\20\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2"+
		"\2@?\3\2\2\2A\t\3\2\2\2BC\7$\2\2CE\7#\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2"+
		"\2FG\7$\2\2GI\7,\2\2HJ\5\16\b\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7-\2\2"+
		"LN\7*\2\2ML\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OP\7$\2\2P[\7,\2\2QR\t\2\2\2"+
		"RX\7$\2\2ST\7\63\2\2TU\t\2\2\2UW\7$\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[Q\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7-\2"+
		"\2^_\5 \21\2_\r\3\2\2\2`e\5$\23\2ab\7\63\2\2bd\5$\23\2ca\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2\2ge\3\2\2\2hq\7.\2\2in\5$\23\2jk\7"+
		"\63\2\2km\5$\23\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2qi\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7/\2\2t\21\3\2\2\2uv\7\37\2\2"+
		"vw\7#\2\2wx\7 \2\2xz\7,\2\2y{\5$\23\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}"+
		"\7-\2\2}~\7*\2\2~\23\3\2\2\2\177\u0080\7\37\2\2\u0080\u0081\7#\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0083\7,\2\2\u0083\u0085\7-\2\2\u0084\u0086\7*\2"+
		"\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u0088"+
		"\7\37\2\2\u0088\u0089\7#\2\2\u0089\u008a\7!\2\2\u008a\u008b\7,\2\2\u008b"+
		"\u008c\7-\2\2\u008c\u008d\7*\2\2\u008d\27\3\2\2\2\u008e\u008f\7\4\2\2"+
		"\u008f\u0091\7\25\2\2\u0090\u0092\t\2\2\2\u0091\u0090\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\24\2\2\u0094\u0097\7$\2\2\u0095"+
		"\u0096\7\60\2\2\u0096\u0098\5$\23\2\u0097\u0095\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7*\2\2\u009a\31\3\2\2\2\u009b\u009c"+
		"\t\2\2\2\u009c\u009d\7$\2\2\u009d\u009e\7*\2\2\u009e\33\3\2\2\2\u009f"+
		"\u00a0\7$\2\2\u00a0\u00a1\7\60\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7*"+
		"\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5$\23\2\u00a6\u00a7"+
		"\5 \21\2\u00a7\37\3\2\2\2\u00a8\u00a9\7.\2\2\u00a9\u00aa\5\"\22\2\u00aa"+
		"\u00ab\7/\2\2\u00ab!\3\2\2\2\u00ac\u00ae\5\b\5\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0#\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\23\1\2\u00b3\u00b4\7\31\2\2\u00b4\u00d0"+
		"\5$\23\23\u00b5\u00b6\7\35\2\2\u00b6\u00d0\5$\23\22\u00b7\u00b8\7\13\2"+
		"\2\u00b8\u00b9\7,\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc"+
		"\5$\23\2\u00bc\u00bd\7-\2\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5 \21\2\u00bf"+
		"\u00c0\7\f\2\2\u00c0\u00c1\5 \21\2\u00c1\u00d0\3\2\2\2\u00c2\u00d0\5\20"+
		"\t\2\u00c3\u00d0\5\f\7\2\u00c4\u00d0\5\n\6\2\u00c5\u00d0\5\24\13\2\u00c6"+
		"\u00d0\5\26\f\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\7-"+
		"\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00d0\t\4\2\2\u00cc\u00d0\t\5\2\2\u00cd"+
		"\u00d0\7$\2\2\u00ce\u00d0\7)\2\2\u00cf\u00b2\3\2\2\2\u00cf\u00b5\3\2\2"+
		"\2\u00cf\u00b7\3\2\2\2\u00cf\u00c2\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4"+
		"\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00df\3\2\2\2\u00d1\u00d2\f\21\2\2\u00d2\u00d3\t\6\2\2\u00d3"+
		"\u00de\5$\23\22\u00d4\u00d5\f\20\2\2\u00d5\u00d6\t\7\2\2\u00d6\u00de\5"+
		"$\23\21\u00d7\u00d8\f\16\2\2\u00d8\u00d9\7\21\2\2\u00d9\u00de\5$\23\17"+
		"\u00da\u00db\f\r\2\2\u00db\u00dc\7\20\2\2\u00dc\u00de\5$\23\16\u00dd\u00d1"+
		"\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0%\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\25\60\67@DIMX[enqz\u0085\u0091\u0097\u00af\u00cf"+
		"\u00dd\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}