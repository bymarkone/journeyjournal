// Generated from /Users/msilveir/personal/Dropbox/marcos/source/journeyjournal/techdash/src/main/antlr/Dashboard.g4 by ANTLR 4.2.2
package com.thoughtworks.techdashboard.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DashboardLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ACCOUNT=1, PROJECT=2, TECH_LEAD=3, TECHNOLOGY=4, BUSINESS_DOMAIN=5, TYPE=6, 
		MARKET=7, ID=8, ALPHANUMERIC=9, PIPE_DASH=10, TWO_DASHES=11, DASH=12, 
		COLON=13, SEMICOLON=14, COMMA=15, CHEVRON=16, END_LINE=17, NEW_LINE=18, 
		WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Account'", "'Project'", "'TechLeads'", "'Technologies'", "'BusinessDomains'", 
		"'Type'", "'Market'", "ID", "ALPHANUMERIC", "'|-'", "TWO_DASHES", "'-'", 
		"':'", "';'", "','", "'>'", "END_LINE", "NEW_LINE", "WS"
	};
	public static final String[] ruleNames = {
		"ACCOUNT", "PROJECT", "TECH_LEAD", "TECHNOLOGY", "BUSINESS_DOMAIN", "TYPE", 
		"MARKET", "ID", "ALPHANUMERIC", "PIPE_DASH", "TWO_DASHES", "DASH", "COLON", 
		"SEMICOLON", "COMMA", "CHEVRON", "END_LINE", "NEW_LINE", "WS"
	};


	public DashboardLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dashboard.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tp\n\t\r\t\16\tq\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\5\22\u0087"+
		"\n\22\3\22\3\22\3\23\5\23\u008c\n\23\3\23\3\23\3\24\6\24\u0091\n\24\r"+
		"\24\16\24\u0092\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\20\2\62;"+
		"C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e"+
		"\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2"+
		"\13\13\"\"\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\61\3\2\2\2\7"+
		"9\3\2\2\2\tC\3\2\2\2\13P\3\2\2\2\r`\3\2\2\2\17e\3\2\2\2\21l\3\2\2\2\23"+
		"s\3\2\2\2\25u\3\2\2\2\27x\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2"+
		"\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0086\3\2\2\2%\u008b\3\2\2\2\'\u0090"+
		"\3\2\2\2)*\7C\2\2*+\7e\2\2+,\7e\2\2,-\7q\2\2-.\7w\2\2./\7p\2\2/\60\7v"+
		"\2\2\60\4\3\2\2\2\61\62\7R\2\2\62\63\7t\2\2\63\64\7q\2\2\64\65\7l\2\2"+
		"\65\66\7g\2\2\66\67\7e\2\2\678\7v\2\28\6\3\2\2\29:\7V\2\2:;\7g\2\2;<\7"+
		"e\2\2<=\7j\2\2=>\7N\2\2>?\7g\2\2?@\7c\2\2@A\7f\2\2AB\7u\2\2B\b\3\2\2\2"+
		"CD\7V\2\2DE\7g\2\2EF\7e\2\2FG\7j\2\2GH\7p\2\2HI\7q\2\2IJ\7n\2\2JK\7q\2"+
		"\2KL\7i\2\2LM\7k\2\2MN\7g\2\2NO\7u\2\2O\n\3\2\2\2PQ\7D\2\2QR\7w\2\2RS"+
		"\7u\2\2ST\7k\2\2TU\7p\2\2UV\7g\2\2VW\7u\2\2WX\7u\2\2XY\7F\2\2YZ\7q\2\2"+
		"Z[\7o\2\2[\\\7c\2\2\\]\7k\2\2]^\7p\2\2^_\7u\2\2_\f\3\2\2\2`a\7V\2\2ab"+
		"\7{\2\2bc\7r\2\2cd\7g\2\2d\16\3\2\2\2ef\7O\2\2fg\7c\2\2gh\7t\2\2hi\7m"+
		"\2\2ij\7g\2\2jk\7v\2\2k\20\3\2\2\2lo\5\23\n\2mp\7\"\2\2np\5\23\n\2om\3"+
		"\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\22\3\2\2\2st\t\2\2\2t"+
		"\24\3\2\2\2uv\7~\2\2vw\7/\2\2w\26\3\2\2\2xy\5\31\r\2yz\5\31\r\2z\30\3"+
		"\2\2\2{|\7/\2\2|\32\3\2\2\2}~\7<\2\2~\34\3\2\2\2\177\u0080\7=\2\2\u0080"+
		"\36\3\2\2\2\u0081\u0082\7.\2\2\u0082 \3\2\2\2\u0083\u0084\7@\2\2\u0084"+
		"\"\3\2\2\2\u0085\u0087\7\60\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0089\5%\23\2\u0089$\3\2\2\2\u008a\u008c"+
		"\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008e\7\f\2\2\u008e&\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\b\24\2\2\u0095(\3\2\2\2\b\2oq\u0086\u008b\u0092"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}