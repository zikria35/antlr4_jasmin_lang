// Generated from C:/Users/zikri/Desktop/School Saxion/compilers and operatingsystems/final/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
package ANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaemonScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, LIST=3, OBJ_TYPE=4, BOOLEAN=5, TEXT=6, NUMBER=7, VOID=8, 
		ARGS=9, THEN=10, IF=11, ELSE=12, WHILE=13, TRUE=14, FALSE=15, OR=16, AND=17, 
		EQ=18, NEQ=19, GT=20, LT=21, GTEQ=22, LTEQ=23, PLUS=24, MINUS=25, MULT=26, 
		DIV=27, MOD=28, NOT=29, NULL=30, CONSOLE=31, PRINT=32, SCANINT=33, SCANSTRING=34, 
		POINT=35, ID=36, SPECIAL_CHAR=37, INT=38, FLOAT=39, DIGITS=40, STRING=41, 
		SEMICOLON=42, COLON=43, PARANTHESE_START=44, PARANTHESE_END=45, BRACKET_START=46, 
		BRACKET_END=47, EQUALS=48, BRACE_START=49, BRACE_END=50, COMMA=51, WS=52, 
		COMMENT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "RETURN", "LIST", "OBJ_TYPE", "BOOLEAN", "TEXT", "NUMBER", "VOID", 
			"ARGS", "THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "NOT", "NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", 
			"ID", "SPECIAL_CHAR", "INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", 
			"COLON", "PARANTHESE_START", "PARANTHESE_END", "BRACKET_START", "BRACKET_END", 
			"EQUALS", "BRACE_START", "BRACE_END", "COMMA", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Main'", "'return'", "'List'", null, "'Boolean'", "'Text'", "'Number'", 
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
			null, "MAIN", "RETURN", "LIST", "OBJ_TYPE", "BOOLEAN", "TEXT", "NUMBER", 
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


	public DaemonScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DaemonScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3%\3%\7%\u010f\n%\f%\16%\u0112\13%\3&\3&\3\'\3\'\3\'\7\'\u0119"+
		"\n\'\f\'\16\'\u011c\13\'\5\'\u011e\n\'\3(\6(\u0121\n(\r(\16(\u0122\3("+
		"\3(\7(\u0127\n(\f(\16(\u012a\13(\3(\3(\6(\u012e\n(\r(\16(\u012f\5(\u0132"+
		"\n(\3)\6)\u0135\n)\r)\16)\u0136\3*\3*\7*\u013b\n*\f*\16*\u013e\13*\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\6\65\u0157\n\65\r\65\16\65\u0158\3\65\3\65\3\66\3\66"+
		"\3\66\7\66\u0160\n\66\f\66\16\66\u0163\13\66\3\66\3\66\2\2\67\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\n\5\2C"+
		"\\aac|\6\2\62;C\\aac|\4\2--/\60\3\2\63;\3\2\62;\4\2\f\f\177\177\5\2\13"+
		"\f\17\17\"\"\3\2\f\f\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5r\3\2\2\2\7y\3\2\2\2\t\u0083\3\2\2\2\13"+
		"\u0085\3\2\2\2\r\u008d\3\2\2\2\17\u0092\3\2\2\2\21\u0099\3\2\2\2\23\u009e"+
		"\3\2\2\2\25\u00a3\3\2\2\2\27\u00a8\3\2\2\2\31\u00ab\3\2\2\2\33\u00b0\3"+
		"\2\2\2\35\u00b6\3\2\2\2\37\u00bb\3\2\2\2!\u00c1\3\2\2\2#\u00c4\3\2\2\2"+
		"%\u00c7\3\2\2\2\'\u00ca\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3"+
		"\2\2\2/\u00d4\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e8"+
		"\3\2\2\2A\u00f0\3\2\2\2C\u00f6\3\2\2\2E\u0101\3\2\2\2G\u010a\3\2\2\2I"+
		"\u010c\3\2\2\2K\u0113\3\2\2\2M\u011d\3\2\2\2O\u0131\3\2\2\2Q\u0134\3\2"+
		"\2\2S\u0138\3\2\2\2U\u0141\3\2\2\2W\u0143\3\2\2\2Y\u0145\3\2\2\2[\u0147"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c\u014f\3\2\2\2e"+
		"\u0151\3\2\2\2g\u0153\3\2\2\2i\u0156\3\2\2\2k\u015c\3\2\2\2mn\7O\2\2n"+
		"o\7c\2\2op\7k\2\2pq\7p\2\2q\4\3\2\2\2rs\7t\2\2st\7g\2\2tu\7v\2\2uv\7w"+
		"\2\2vw\7t\2\2wx\7p\2\2x\6\3\2\2\2yz\7N\2\2z{\7k\2\2{|\7u\2\2|}\7v\2\2"+
		"}\b\3\2\2\2~\u0084\5\17\b\2\177\u0084\5\r\7\2\u0080\u0084\5\13\6\2\u0081"+
		"\u0084\5\7\4\2\u0082\u0084\5\21\t\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\n\3\2\2\2"+
		"\u0085\u0086\7D\2\2\u0086\u0087\7q\2\2\u0087\u0088\7q\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c\7p\2\2\u008c"+
		"\f\3\2\2\2\u008d\u008e\7V\2\2\u008e\u008f\7g\2\2\u008f\u0090\7z\2\2\u0090"+
		"\u0091\7v\2\2\u0091\16\3\2\2\2\u0092\u0093\7P\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7o\2\2\u0095\u0096\7d\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2"+
		"\u0098\20\3\2\2\2\u0099\u009a\7X\2\2\u009a\u009b\7q\2\2\u009b\u009c\7"+
		"k\2\2\u009c\u009d\7f\2\2\u009d\22\3\2\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7u\2\2\u00a2\24\3\2\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\26\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\30\3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\32\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5\34\3\2\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\36\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7~\2\2\u00c2"+
		"\u00c3\7~\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7(\2\2\u00c5\u00c6\7(\2\2\u00c6"+
		"$\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9\7?\2\2\u00c9&\3\2\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\u00cc\7?\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce*\3"+
		"\2\2\2\u00cf\u00d0\7>\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d6\60"+
		"\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7/\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7\61\2\2\u00de"+
		"8\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2"+
		"<\3\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7n\2\2"+
		"\u00ee\u00ef\7g\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7t\2"+
		"\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5B\3\2"+
		"\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7o\2\2\u00fd"+
		"\u00fe\7d\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100D\3\2\2\2\u0101"+
		"\u0102\7u\2\2\u0102\u0103\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7p\2\2"+
		"\u0105\u0106\7V\2\2\u0106\u0107\7g\2\2\u0107\u0108\7z\2\2\u0108\u0109"+
		"\7v\2\2\u0109F\3\2\2\2\u010a\u010b\7\60\2\2\u010bH\3\2\2\2\u010c\u0110"+
		"\t\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111J\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0114\t\4\2\2\u0114L\3\2\2\2\u0115\u011e\7\62\2\2\u0116\u011a\t"+
		"\5\2\2\u0117\u0119\t\6\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011eN\3\2\2\2\u011f\u0121"+
		"\t\6\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0128\7\60\2\2\u0125\u0127\t"+
		"\6\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0132\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7\60"+
		"\2\2\u012c\u012e\t\6\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0120\3\2"+
		"\2\2\u0131\u012b\3\2\2\2\u0132P\3\2\2\2\u0133\u0135\t\6\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"R\3\2\2\2\u0138\u013c\5c\62\2\u0139\u013b\n\7\2\2\u013a\u0139\3\2\2\2"+
		"\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5e\63\2\u0140T\3\2\2\2\u0141"+
		"\u0142\7=\2\2\u0142V\3\2\2\2\u0143\u0144\7<\2\2\u0144X\3\2\2\2\u0145\u0146"+
		"\7*\2\2\u0146Z\3\2\2\2\u0147\u0148\7+\2\2\u0148\\\3\2\2\2\u0149\u014a"+
		"\7]\2\2\u014a^\3\2\2\2\u014b\u014c\7_\2\2\u014c`\3\2\2\2\u014d\u014e\7"+
		"?\2\2\u014eb\3\2\2\2\u014f\u0150\7}\2\2\u0150d\3\2\2\2\u0151\u0152\7\177"+
		"\2\2\u0152f\3\2\2\2\u0153\u0154\7.\2\2\u0154h\3\2\2\2\u0155\u0157\t\b"+
		"\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\65\2\2\u015bj\3\2\2\2"+
		"\u015c\u015d\5\67\34\2\u015d\u0161\5\67\34\2\u015e\u0160\n\t\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b\66\2\2\u0165"+
		"l\3\2\2\2\17\2\u0083\u0110\u011a\u011d\u0122\u0128\u012f\u0131\u0136\u013c"+
		"\u0158\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}