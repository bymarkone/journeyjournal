// Generated from /Users/msilveir/personal/Dropbox/marcos/source/journeyjournal/jarvis/src/main/antlr/Jarvis.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.jarvis.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JarvisLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, CAPABILITY_DESCRIPTOR=9, 
		GOALS_DESCRIPTOR=10, HIGHLIGH_DESCRIPTOR=11, TOPIC_DESCRIPTOR=12, GREAT_FEEDBACK_DESCRIPTOR=13, 
		CONSTRUCTIVE_FEEDBACK_DESCRIPTOR=14, TASKS_DESCRIPTOR=15, FROM_DESCRIPTOR=16, 
		CONNECTOR=17, DIGIT=18, IDENTIFIER=19, NEW_LINE=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' '", "'!'", "'('", "')'", "':'", "','", "'-'", "'.'", "CAPABILITY_DESCRIPTOR", 
		"GOALS_DESCRIPTOR", "HIGHLIGH_DESCRIPTOR", "TOPIC_DESCRIPTOR", "'The great feedback that I got was:'", 
		"'The constructive feedback that I got was:'", "TASKS_DESCRIPTOR", "FROM_DESCRIPTOR", 
		"CONNECTOR", "DIGIT", "IDENTIFIER", "NEW_LINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "CAPABILITY_DESCRIPTOR", 
		"GOALS_DESCRIPTOR", "HIGHLIGH_DESCRIPTOR", "TOPIC_DESCRIPTOR", "GREAT_FEEDBACK_DESCRIPTOR", 
		"CONSTRUCTIVE_FEEDBACK_DESCRIPTOR", "TASKS_DESCRIPTOR", "FROM_DESCRIPTOR", 
		"CONNECTOR", "DIGIT", "IDENTIFIER", "NEW_LINE", "WS", "NameChar", "NameStartChar"
	};


	public JarvisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jarvis.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\7\nC"+
		"\n\n\f\n\16\nF\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\ng\n\n\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\7\20\u011a\n\20\f\20\16\20\u011d\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\7\21\u0135\n\21\f\21\16\21\u0138\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u0142\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u014a\n\22\3\23\6\23\u014d\n\23\r\23\16\23\u014e\3\24"+
		"\3\24\6\24\u0153\n\24\r\24\16\24\u0154\3\25\5\25\u0158\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0162\n\27\3\30\3\30\2\2\31\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\2/\2\3\2\5\4\2\13\13\"\"\7\2\62;aa\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301"+
		"\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\u0170\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2"+
		"\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23f\3\2\2\2\25k\3\2\2\2\27\u0087"+
		"\3\2\2\2\31\u00bd\3\2\2\2\33\u00cb\3\2\2\2\35\u00ee\3\2\2\2\37\u011b\3"+
		"\2\2\2!\u0136\3\2\2\2#\u0141\3\2\2\2%\u014c\3\2\2\2\'\u0152\3\2\2\2)\u0157"+
		"\3\2\2\2+\u015b\3\2\2\2-\u0161\3\2\2\2/\u0163\3\2\2\2\61\62\7\"\2\2\62"+
		"\4\3\2\2\2\63\64\7#\2\2\64\6\3\2\2\2\65\66\7*\2\2\66\b\3\2\2\2\678\7+"+
		"\2\28\n\3\2\2\29:\7<\2\2:\f\3\2\2\2;<\7.\2\2<\16\3\2\2\2=>\7/\2\2>\20"+
		"\3\2\2\2?@\7\60\2\2@\22\3\2\2\2AC\7\"\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7K\2\2HI\7\"\2\2IJ\7y\2\2JK\7c\2\2"+
		"KL\7p\2\2LM\7v\2\2MN\7\"\2\2NO\7v\2\2OP\7q\2\2PQ\7\"\2\2QR\7d\2\2RS\7"+
		"g\2\2ST\7\"\2\2TU\7c\2\2Ug\7\"\2\2VW\7K\2\2WX\7\"\2\2XY\7y\2\2YZ\7c\2"+
		"\2Z[\7p\2\2[\\\7v\2\2\\]\7\"\2\2]^\7v\2\2^_\7q\2\2_`\7\"\2\2`a\7d\2\2"+
		"ab\7g\2\2bc\7\"\2\2cd\7c\2\2de\7p\2\2eg\7\"\2\2fD\3\2\2\2fV\3\2\2\2g\24"+
		"\3\2\2\2hj\7\"\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2m"+
		"k\3\2\2\2no\7O\2\2op\7{\2\2pq\7\"\2\2qr\7j\2\2rs\7k\2\2st\7i\2\2tu\7j"+
		"\2\2uv\7\"\2\2vw\7n\2\2wx\7g\2\2xy\7x\2\2yz\7g\2\2z{\7n\2\2{|\7\"\2\2"+
		"|}\7i\2\2}~\7q\2\2~\177\7c\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2"+
		"\2\u0085\u0086\7<\2\2\u0086\26\3\2\2\2\u0087\u0088\7Y\2\2\u0088\u0089"+
		"\7j\2\2\u0089\u008a\7c\2\2\u008a\u008b\7v\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008d\7K\2\2\u008d\u008e\7\"\2\2\u008e\u008f\7y\2\2\u008f\u0090\7q\2"+
		"\2\u0090\u0091\7w\2\2\u0091\u0092\7n\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7\"\2\2\u0094\u0095\7n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7m\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7v\2\2\u009a\u009b\7q\2"+
		"\2\u009b\u009c\7\"\2\2\u009c\u009d\7j\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7i\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7i\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7\"\2"+
		"\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa"+
		"\7y\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7\"\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7f\2"+
		"\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b9\7\"\2\2\u00b8"+
		"\u00b5\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\30\3\2\2\2\u00ba\u00bc\7\"\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7Q\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7q\2"+
		"\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9"+
		"\7<\2\2\u00c9\u00ca\7\"\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7V\2\2\u00cc"+
		"\u00cd\7j\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7i\2"+
		"\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7c\2\2"+
		"\u00db\u00dc\7e\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7\"\2\2\u00de\u00df"+
		"\7v\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"\u00e3\7\"\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\7i\2"+
		"\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea"+
		"\7y\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7<\2\2\u00ed"+
		"\34\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7\"\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2"+
		"\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7w\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7k\2\2\u00fc"+
		"\u00fd\7x\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7h\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7g\2\2\u0102\u0103\7f\2\2\u0103\u0104"+
		"\7d\2\2\u0104\u0105\7c\2\2\u0105\u0106\7e\2\2\u0106\u0107\7m\2\2\u0107"+
		"\u0108\7\"\2\2\u0108\u0109\7v\2\2\u0109\u010a\7j\2\2\u010a\u010b\7c\2"+
		"\2\u010b\u010c\7v\2\2\u010c\u010d\7\"\2\2\u010d\u010e\7K\2\2\u010e\u010f"+
		"\7\"\2\2\u010f\u0110\7i\2\2\u0110\u0111\7q\2\2\u0111\u0112\7v\2\2\u0112"+
		"\u0113\7\"\2\2\u0113\u0114\7y\2\2\u0114\u0115\7c\2\2\u0115\u0116\7u\2"+
		"\2\u0116\u0117\7<\2\2\u0117\36\3\2\2\2\u0118\u011a\7\"\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7V\2\2\u011f\u0120\7q\2"+
		"\2\u0120\u0121\7\"\2\2\u0121\u0122\7i\2\2\u0122\u0123\7g\2\2\u0123\u0124"+
		"\7v\2\2\u0124\u0125\7\"\2\2\u0125\u0126\7v\2\2\u0126\u0127\7j\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7\"\2"+
		"\2\u012b\u012c\7K\2\2\u012c\u012d\7\"\2\2\u012d\u012e\7y\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7n\2\2\u0130\u0131\7n\2\2\u0131\u0132\7<\2\2\u0132"+
		" \3\2\2\2\u0133\u0135\7\"\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013a\7H\2\2\u013a\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7<\2\2\u013e\u013f\7\"\2\2\u013f\"\3\2\2\2\u0140"+
		"\u0142\7\"\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\7v\2\2\u0144\u0145\7j\2\2\u0145\u0146\7c\2\2\u0146\u0147"+
		"\7v\2\2\u0147\u0149\3\2\2\2\u0148\u014a\7\"\2\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a$\3\2\2\2\u014b\u014d\4\62;\2\u014c\u014b\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f&\3"+
		"\2\2\2\u0150\u0153\5-\27\2\u0151\u0153\7b\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155(\3\2\2\2\u0156\u0158\7\17\2\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\f\2\2\u015a*\3\2\2\2\u015b"+
		"\u015c\t\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b\26\2\2\u015e,\3\2\2\2"+
		"\u015f\u0162\5/\30\2\u0160\u0162\t\3\2\2\u0161\u015f\3\2\2\2\u0161\u0160"+
		"\3\2\2\2\u0162.\3\2\2\2\u0163\u0164\t\4\2\2\u0164\60\3\2\2\2\21\2Dfk\u00b8"+
		"\u00bd\u011b\u0136\u0141\u0149\u014e\u0152\u0154\u0157\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}