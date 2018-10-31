// Generated from TigerLLK.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLLKLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, MAIN=3, COMMA=4, COLON=5, SEMI=6, LPAREN=7, RPAREN=8, 
		LBRACK=9, RBRACK=10, LBRACE=11, RBRACE=12, PERIOD=13, PLUS=14, MINUS=15, 
		MULT=16, DIV=17, EXP=18, EQ=19, NEQ=20, LESSER=21, GREATER=22, LESSEREQ=23, 
		GREATEREQ=24, AND=25, OR=26, ASSIGN=27, ARRAY=28, RECORD=29, BREAK=30, 
		DO=31, ELSE=32, FOR=33, FUNC=34, IF=35, IN=36, LET=37, OF=38, THEN=39, 
		TO=40, TYPE=41, VAR=42, WHILE=43, ENDIF=44, BEGIN=45, ENDDO=46, END=47, 
		RETURN=48, INTLIT=49, FLOATLIT=50, ID=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "MAIN", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "LBRACE", "RBRACE", "PERIOD", "PLUS", "MINUS", "MULT", 
		"DIV", "EXP", "EQ", "NEQ", "LESSER", "GREATER", "LESSEREQ", "GREATEREQ", 
		"AND", "OR", "ASSIGN", "ARRAY", "RECORD", "BREAK", "DO", "ELSE", "FOR", 
		"FUNC", "IF", "IN", "LET", "OF", "THEN", "TO", "TYPE", "VAR", "WHILE", 
		"ENDIF", "BEGIN", "ENDDO", "END", "RETURN", "INTLIT", "FLOATLIT", "ID", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'main'", "','", "':'", "';'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "'.'", "'+'", "'-'", "'*'", "'/'", "'**'", 
		"'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'&'", "'|'", "':='", "'array'", 
		"'record'", "'break'", "'do'", "'else'", "'for'", "'function'", "'if'", 
		"'in'", "'let'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", 
		"'endif'", "'begin'", "'enddo'", "'end'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "MAIN", "COMMA", "COLON", "SEMI", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "LBRACE", "RBRACE", "PERIOD", "PLUS", "MINUS", "MULT", 
		"DIV", "EXP", "EQ", "NEQ", "LESSER", "GREATER", "LESSEREQ", "GREATEREQ", 
		"AND", "OR", "ASSIGN", "ARRAY", "RECORD", "BREAK", "DO", "ELSE", "FOR", 
		"FUNC", "IF", "IN", "LET", "OF", "THEN", "TO", "TYPE", "VAR", "WHILE", 
		"ENDIF", "BEGIN", "ENDDO", "END", "RETURN", "INTLIT", "FLOATLIT", "ID", 
		"WS"
	};
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


	public TigerLLKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TigerLLK.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\6\62\u011c\n\62\r\62\16\62\u011d\5\62\u0120"+
		"\n\62\3\63\3\63\3\63\6\63\u0125\n\63\r\63\16\63\u0126\5\63\u0129\n\63"+
		"\3\63\3\63\7\63\u012d\n\63\f\63\16\63\u0130\13\63\3\64\3\64\7\64\u0134"+
		"\n\64\f\64\16\64\u0137\13\64\3\65\6\65\u013a\n\65\r\65\16\65\u013b\3\65"+
		"\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66\3\2\5\4\2C\\c|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u0145\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7u\3\2\2\2"+
		"\tz\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2\23"+
		"\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c"+
		"\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2"+
		"\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009e\3\2\2\2-\u00a0"+
		"\3\2\2\2/\u00a2\3\2\2\2\61\u00a5\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2"+
		"\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b5\3\2\2\2=\u00bc\3\2\2\2?\u00c2"+
		"\3\2\2\2A\u00c5\3\2\2\2C\u00ca\3\2\2\2E\u00ce\3\2\2\2G\u00d7\3\2\2\2I"+
		"\u00da\3\2\2\2K\u00dd\3\2\2\2M\u00e1\3\2\2\2O\u00e4\3\2\2\2Q\u00e9\3\2"+
		"\2\2S\u00ec\3\2\2\2U\u00f1\3\2\2\2W\u00f5\3\2\2\2Y\u00fb\3\2\2\2[\u0101"+
		"\3\2\2\2]\u0107\3\2\2\2_\u010d\3\2\2\2a\u0111\3\2\2\2c\u011f\3\2\2\2e"+
		"\u0128\3\2\2\2g\u0131\3\2\2\2i\u0139\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7v\2"+
		"\2n\4\3\2\2\2op\7h\2\2pq\7n\2\2qr\7q\2\2rs\7c\2\2st\7v\2\2t\6\3\2\2\2"+
		"uv\7o\2\2vw\7c\2\2wx\7k\2\2xy\7p\2\2y\b\3\2\2\2z{\7.\2\2{\n\3\2\2\2|}"+
		"\7<\2\2}\f\3\2\2\2~\177\7=\2\2\177\16\3\2\2\2\u0080\u0081\7*\2\2\u0081"+
		"\20\3\2\2\2\u0082\u0083\7+\2\2\u0083\22\3\2\2\2\u0084\u0085\7]\2\2\u0085"+
		"\24\3\2\2\2\u0086\u0087\7_\2\2\u0087\26\3\2\2\2\u0088\u0089\7}\2\2\u0089"+
		"\30\3\2\2\2\u008a\u008b\7\177\2\2\u008b\32\3\2\2\2\u008c\u008d\7\60\2"+
		"\2\u008d\34\3\2\2\2\u008e\u008f\7-\2\2\u008f\36\3\2\2\2\u0090\u0091\7"+
		"/\2\2\u0091 \3\2\2\2\u0092\u0093\7,\2\2\u0093\"\3\2\2\2\u0094\u0095\7"+
		"\61\2\2\u0095$\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7,\2\2\u0098&\3"+
		"\2\2\2\u0099\u009a\7?\2\2\u009a(\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d"+
		"\7@\2\2\u009d*\3\2\2\2\u009e\u009f\7>\2\2\u009f,\3\2\2\2\u00a0\u00a1\7"+
		"@\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7?\2\2\u00a4\60\3"+
		"\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7\62\3\2\2\2\u00a8\u00a9"+
		"\7(\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7~\2\2\u00ab\66\3\2\2\2\u00ac\u00ad"+
		"\7<\2\2\u00ad\u00ae\7?\2\2\u00ae8\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7{\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7e\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7f\2\2\u00bb<\3\2\2\2\u00bc"+
		"\u00bd\7d\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c1\7m\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7q\2"+
		"\2\u00c4@\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7"+
		"u\2\2\u00c8\u00c9\7g\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7t\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0"+
		"\7w\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"\u00d4\7k\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6F\3\2\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7h\2\2\u00d9H\3\2\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"N\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8P\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"R\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7r\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0T\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4V\3\2\2\2\u00f5\u00f6\7y\2\2\u00f6\u00f7\7j\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00faX\3\2\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ff\u0100\7h\2\2\u0100Z\3\2\2\2\u0101\u0102\7d\2\2\u0102\u0103\7g\2"+
		"\2\u0103\u0104\7i\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\\\3"+
		"\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010a"+
		"\u010b\7f\2\2\u010b\u010c\7q\2\2\u010c^\3\2\2\2\u010d\u010e\7g\2\2\u010e"+
		"\u010f\7p\2\2\u010f\u0110\7f\2\2\u0110`\3\2\2\2\u0111\u0112\7t\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7v\2\2\u0114\u0115\7w\2\2\u0115\u0116\7t\2\2"+
		"\u0116\u0117\7p\2\2\u0117b\3\2\2\2\u0118\u0120\4\62;\2\u0119\u011b\4\63"+
		";\2\u011a\u011c\4\62;\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0118\3\2"+
		"\2\2\u011f\u0119\3\2\2\2\u0120d\3\2\2\2\u0121\u0129\4\62;\2\u0122\u0124"+
		"\4\63;\2\u0123\u0125\4\62;\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0121\3\2"+
		"\2\2\u0128\u0122\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012e\7\60\2\2\u012b"+
		"\u012d\4\62;\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012ff\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135"+
		"\t\2\2\2\u0132\u0134\t\3\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136h\3\2\2\2\u0137\u0135\3\2\2\2"+
		"\u0138\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\65\2\2"+
		"\u013ej\3\2\2\2\n\2\u011d\u011f\u0126\u0128\u012e\u0135\u013b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}