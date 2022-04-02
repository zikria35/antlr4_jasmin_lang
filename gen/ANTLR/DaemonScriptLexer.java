// Generated from C:/Users/Zikiria/Desktop/School Saxion/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
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
		T__0=1, LIST=2, BOOLEAN=3, TEXT=4, NUMBER=5, OBJ_TYPE=6, ARGS=7, THEN=8, 
		IF=9, ELSE=10, WHILE=11, TRUE=12, FALSE=13, OR=14, AND=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTEQ=20, LTEQ=21, PLUS=22, MINUS=23, MULT=24, DIV=25, MOD=26, 
		NOT=27, NULL=28, CONSOLE=29, PRINT=30, SCANINT=31, SCANSTRING=32, POINT=33, 
		ID=34, SPECIAL_CHAR=35, INT=36, FLOAT=37, DIGITS=38, STRING=39, SEMICOLON=40, 
		COLON=41, PARANTHESE_START=42, PARANTHESE_END=43, BRACKET_START=44, BRACKET_END=45, 
		EQUALS=46, BRACE_START=47, BRACE_END=48, COMMA=49, WS=50, COMMENT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LIST", "BOOLEAN", "TEXT", "NUMBER", "OBJ_TYPE", "ARGS", "THEN", 
			"IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "NULL", 
			"CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", "ID", "SPECIAL_CHAR", 
			"INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", "COLON", "PARANTHESE_START", 
			"PARANTHESE_END", "BRACKET_START", "BRACKET_END", "EQUALS", "BRACE_START", 
			"BRACE_END", "COMMA", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3#\3#\7#\u00fd\n#\f#\16#\u0100\13#\3$\3$\3%\3%\3%\7%\u0107\n"+
		"%\f%\16%\u010a\13%\5%\u010c\n%\3&\6&\u010f\n&\r&\16&\u0110\3&\3&\7&\u0115"+
		"\n&\f&\16&\u0118\13&\3&\3&\6&\u011c\n&\r&\16&\u011d\5&\u0120\n&\3\'\6"+
		"\'\u0123\n\'\r\'\16\'\u0124\3(\3(\7(\u0129\n(\f(\16(\u012c\13(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\6\63\u0145\n\63\r\63\16\63\u0146\3\63\3\63\3\64\3\64\3\64\7\64\u014e"+
		"\n\64\f\64\16\64\u0151\13\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"--/\60\3\2\63;\3\2\62;\4\2\f\f\177\177\5\2\13\f\17\17\"\"\3\2\f\f\2\u0161"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5n\3\2\2\2\7s\3\2\2"+
		"\2\t{\3\2\2\2\13\u0080\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u0092"+
		"\3\2\2\2\23\u0097\3\2\2\2\25\u009a\3\2\2\2\27\u009f\3\2\2\2\31\u00a5\3"+
		"\2\2\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2\37\u00b3\3\2\2\2!\u00b6\3\2\2"+
		"\2#\u00b9\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2"+
		"\2\65\u00ce\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d7\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e5\3\2\2\2A\u00ed\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G"+
		"\u0101\3\2\2\2I\u010b\3\2\2\2K\u011f\3\2\2\2M\u0122\3\2\2\2O\u0126\3\2"+
		"\2\2Q\u012f\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u0139\3\2\2\2]\u013b\3\2\2\2_\u013d\3\2\2\2a\u013f\3\2\2\2c"+
		"\u0141\3\2\2\2e\u0144\3\2\2\2g\u014a\3\2\2\2ij\7O\2\2jk\7c\2\2kl\7k\2"+
		"\2lm\7p\2\2m\4\3\2\2\2no\7N\2\2op\7k\2\2pq\7u\2\2qr\7v\2\2r\6\3\2\2\2"+
		"st\7D\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2wx\7g\2\2xy\7c\2\2yz\7p\2\2z\b\3\2"+
		"\2\2{|\7V\2\2|}\7g\2\2}~\7z\2\2~\177\7v\2\2\177\n\3\2\2\2\u0080\u0081"+
		"\7P\2\2\u0081\u0082\7w\2\2\u0082\u0083\7o\2\2\u0083\u0084\7d\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7t\2\2\u0086\f\3\2\2\2\u0087\u008c\5\13\6\2"+
		"\u0088\u008c\5\t\5\2\u0089\u008c\5\7\4\2\u008a\u008c\5\5\3\2\u008b\u0087"+
		"\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\16\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090\7i\2\2\u0090"+
		"\u0091\7u\2\2\u0091\20\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\22\3\2\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\24\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e\26\3\2\2\2\u009f\u00a0\7y\2\2\u00a0"+
		"\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\30\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7"+
		"w\2\2\u00a8\u00a9\7g\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\34\3\2\2\2\u00b0\u00b1\7~\2\2\u00b1\u00b2\7~\2\2\u00b2\36\3\2\2\2\u00b3"+
		"\u00b4\7(\2\2\u00b4\u00b5\7(\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd&\3\2\2\2\u00be\u00bf\7>\2\2\u00bf("+
		"\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7?\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4\u00c5\7?\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7.\3"+
		"\2\2\2\u00c8\u00c9\7/\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\62"+
		"\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7\'\2\2\u00cf"+
		"\66\3\2\2\2\u00d0\u00d1\7#\2\2\u00d18\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7n\2\2\u00d6:\3\2\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7u\2\2"+
		"\u00db\u00dc\7q\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de<\3\2\2"+
		"\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3\u00e4\7v\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7K\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		"\u00ef\7e\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7U\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7i\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9D"+
		"\3\2\2\2\u00fa\u00fe\t\2\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffF\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0102\t\4\2\2\u0102H\3\2\2\2\u0103\u010c\7"+
		"\62\2\2\u0104\u0108\t\5\2\2\u0105\u0107\t\6\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0104\3\2\2\2\u010c"+
		"J\3\2\2\2\u010d\u010f\t\6\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116"+
		"\7\60\2\2\u0113\u0115\t\6\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0120\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011b\7\60\2\2\u011a\u011c\t\6\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u010e\3\2\2\2\u011f\u0119\3\2\2\2\u0120L\3\2\2\2\u0121"+
		"\u0123\t\6\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125N\3\2\2\2\u0126\u012a\5_\60\2\u0127\u0129"+
		"\n\7\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5a"+
		"\61\2\u012eP\3\2\2\2\u012f\u0130\7=\2\2\u0130R\3\2\2\2\u0131\u0132\7<"+
		"\2\2\u0132T\3\2\2\2\u0133\u0134\7*\2\2\u0134V\3\2\2\2\u0135\u0136\7+\2"+
		"\2\u0136X\3\2\2\2\u0137\u0138\7]\2\2\u0138Z\3\2\2\2\u0139\u013a\7_\2\2"+
		"\u013a\\\3\2\2\2\u013b\u013c\7?\2\2\u013c^\3\2\2\2\u013d\u013e\7}\2\2"+
		"\u013e`\3\2\2\2\u013f\u0140\7\177\2\2\u0140b\3\2\2\2\u0141\u0142\7.\2"+
		"\2\u0142d\3\2\2\2\u0143\u0145\t\b\2\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\b\63\2\2\u0149f\3\2\2\2\u014a\u014b\5\63\32\2\u014b\u014f\5\63"+
		"\32\2\u014c\u014e\n\t\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0153\b\64\2\2\u0153h\3\2\2\2\17\2\u008b\u00fe\u0108\u010b"+
		"\u0110\u0116\u011d\u011f\u0124\u012a\u0146\u014f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}