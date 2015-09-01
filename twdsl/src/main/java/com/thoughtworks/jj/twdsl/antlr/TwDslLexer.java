// Generated from /Users/aarni/Documents/tw/journeyjournal/twdsl/src/main/antlr/TwDsl.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.twdsl.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TwDslLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, DESCRIPTION=3, VERBS=4, OBJECTS=5, CONJUNCTIONS=6, FACT=7, 
		ABOUT=8, IDENTIFIERS=9, QUOTED=10, QUOTE=11, END_LINE=12, NEW_LINE=13, 
		WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'on time'", "'for topic'", "DESCRIPTION", "VERBS", "OBJECTS", "CONJUNCTIONS", 
		"'Fact'", "'about'", "IDENTIFIERS", "QUOTED", "QUOTE", "END_LINE", "NEW_LINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "DESCRIPTION", "VERBS", "OBJECTS", "CONJUNCTIONS", "FACT", 
		"ABOUT", "IDENTIFIERS", "QUOTED", "QUOTE", "END_LINE", "NEW_LINE", "WS"
	};


	public TwDslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TwDsl.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\64\n\4\r\4"+
		"\16\4\65\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\6\n\u00b3\n\n\r\n\16\n\u00b4\3\13\3\13\7\13\u00b9"+
		"\n\13\f\13\16\13\u00bc\13\13\3\13\3\13\3\f\3\f\3\r\5\r\u00c3\n\r\3\r\5"+
		"\r\u00c6\n\r\3\16\5\16\u00c9\n\16\3\16\3\16\3\17\6\17\u00ce\n\17\r\17"+
		"\16\17\u00cf\3\17\3\17\4\65\u00ba\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\5\2\62;C\\c|\4\2$$))\4\2\13"+
		"\13\"\"\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\'\3"+
		"\2\2\2\7\61\3\2\2\2\tT\3\2\2\2\13\u0096\3\2\2\2\r\u00a4\3\2\2\2\17\u00a6"+
		"\3\2\2\2\21\u00ab\3\2\2\2\23\u00b2\3\2\2\2\25\u00b6\3\2\2\2\27\u00bf\3"+
		"\2\2\2\31\u00c2\3\2\2\2\33\u00c8\3\2\2\2\35\u00cd\3\2\2\2\37 \7q\2\2 "+
		"!\7p\2\2!\"\7\"\2\2\"#\7v\2\2#$\7k\2\2$%\7o\2\2%&\7g\2\2&\4\3\2\2\2\'"+
		"(\7h\2\2()\7q\2\2)*\7t\2\2*+\7\"\2\2+,\7v\2\2,-\7q\2\2-.\7r\2\2./\7k\2"+
		"\2/\60\7e\2\2\60\6\3\2\2\2\61\63\7<\2\2\62\64\13\2\2\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\3\2\2\2\65\63\3\2\2\2\66\67\3\2\2\2\678\5\33\16\28\b"+
		"\3\2\2\29:\7e\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=>\7v\2\2>U\7g\2\2?@\7u\2"+
		"\2@A\7g\2\2AU\7v\2\2BC\7t\2\2CD\7g\2\2DE\7e\2\2EF\7g\2\2FG\7k\2\2GH\7"+
		"x\2\2HU\7g\2\2IJ\7c\2\2JK\7f\2\2KU\7f\2\2LM\7t\2\2MN\7g\2\2NO\7i\2\2O"+
		"P\7k\2\2PQ\7u\2\2QR\7v\2\2RS\7g\2\2SU\7t\2\2T9\3\2\2\2T?\3\2\2\2TB\3\2"+
		"\2\2TI\3\2\2\2TL\3\2\2\2U\n\3\2\2\2VW\7E\2\2WX\7c\2\2XY\7r\2\2YZ\7c\2"+
		"\2Z[\7d\2\2[\\\7k\2\2\\]\7n\2\2]^\7k\2\2^_\7v\2\2_\u0097\7{\2\2`a\7C\2"+
		"\2ab\7t\2\2bc\7g\2\2c\u0097\7c\2\2de\7I\2\2ef\7q\2\2fg\7c\2\2g\u0097\7"+
		"n\2\2hi\7C\2\2ij\7e\2\2jk\7v\2\2kl\7k\2\2lm\7q\2\2mn\7p\2\2no\7\"\2\2"+
		"op\7K\2\2pq\7v\2\2qr\7g\2\2r\u0097\7o\2\2st\7I\2\2tu\7t\2\2uv\7g\2\2v"+
		"w\7c\2\2wx\7v\2\2xy\7\"\2\2yz\7H\2\2z{\7g\2\2{|\7g\2\2|}\7f\2\2}~\7d\2"+
		"\2~\177\7c\2\2\177\u0080\7e\2\2\u0080\u0097\7m\2\2\u0081\u0082\7E\2\2"+
		"\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7x\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7\"\2\2\u008e\u008f\7H\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7f\2\2\u0092\u0093\7d\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0097\7m\2\2\u0096V\3\2\2\2\u0096`\3\2\2\2\u0096d"+
		"\3\2\2\2\u0096h\3\2\2\2\u0096s\3\2\2\2\u0096\u0081\3\2\2\2\u0097\f\3\2"+
		"\2\2\u0098\u0099\7y\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b\u00a5"+
		"\7j\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e\u00a5\7f\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7d\2"+
		"\2\u00a3\u00a5\7g\2\2\u00a4\u0098\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009f"+
		"\3\2\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7H\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7e\2\2\u00a9\u00aa\7v\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7d\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7v\2\2"+
		"\u00b0\22\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\24\3\2\2\2\u00b6"+
		"\u00ba\5\27\f\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5\27\f\2\u00be\26\3\2\2\2\u00bf\u00c0\t\3\2"+
		"\2\u00c0\30\3\2\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5\33\16\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\32\3\2\2\2\u00c7\u00c9\7\17\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\f\2\2\u00cb"+
		"\34\3\2\2\2\u00cc\u00ce\t\4\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\b\17\2\2\u00d2\36\3\2\2\2\r\2\65T\u0096\u00a4\u00b4\u00ba\u00c2\u00c5"+
		"\u00c8\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}