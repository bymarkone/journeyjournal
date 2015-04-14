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
		ID=1, ACCOUNT=2, PROJECT=3, TECH_LEAD=4, TECHNOLOGY=5, BUSINESS_DOMAIN=6, 
		TWO_DASHES=7, DASH=8, COLON=9, CHEVRON=10, END_LINE=11, NEW_LINE=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "'Account'", "'Project'", "'TechLead'", "'Technologies'", "'BusinessDomains'", 
		"TWO_DASHES", "'-'", "':'", "'>'", "END_LINE", "NEW_LINE", "WS"
	};
	public static final String[] ruleNames = {
		"ID", "ACCOUNT", "PROJECT", "TECH_LEAD", "TECHNOLOGY", "BUSINESS_DOMAIN", 
		"TWO_DASHES", "DASH", "COLON", "CHEVRON", "END_LINE", "NEW_LINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\fd\n\f\3\f\3\f\3\r\5\ri\n\r\3\r\3"+
		"\r\3\16\6\16n\n\16\r\16\16\16o\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\4\5\2\62;C\\c|\4\2\13\13"+
		"\"\"w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2\7+\3\2\2\2\t\63"+
		"\3\2\2\2\13<\3\2\2\2\rI\3\2\2\2\17Y\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25"+
		"`\3\2\2\2\27c\3\2\2\2\31h\3\2\2\2\33m\3\2\2\2\35 \t\2\2\2\36 \5\33\16"+
		"\2\37\35\3\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\4\3"+
		"\2\2\2#$\7C\2\2$%\7e\2\2%&\7e\2\2&\'\7q\2\2\'(\7w\2\2()\7p\2\2)*\7v\2"+
		"\2*\6\3\2\2\2+,\7R\2\2,-\7t\2\2-.\7q\2\2./\7l\2\2/\60\7g\2\2\60\61\7e"+
		"\2\2\61\62\7v\2\2\62\b\3\2\2\2\63\64\7V\2\2\64\65\7g\2\2\65\66\7e\2\2"+
		"\66\67\7j\2\2\678\7N\2\289\7g\2\29:\7c\2\2:;\7f\2\2;\n\3\2\2\2<=\7V\2"+
		"\2=>\7g\2\2>?\7e\2\2?@\7j\2\2@A\7p\2\2AB\7q\2\2BC\7n\2\2CD\7q\2\2DE\7"+
		"i\2\2EF\7k\2\2FG\7g\2\2GH\7u\2\2H\f\3\2\2\2IJ\7D\2\2JK\7w\2\2KL\7u\2\2"+
		"LM\7k\2\2MN\7p\2\2NO\7g\2\2OP\7u\2\2PQ\7u\2\2QR\7F\2\2RS\7q\2\2ST\7o\2"+
		"\2TU\7c\2\2UV\7k\2\2VW\7p\2\2WX\7u\2\2X\16\3\2\2\2YZ\5\21\t\2Z[\5\21\t"+
		"\2[\20\3\2\2\2\\]\7/\2\2]\22\3\2\2\2^_\7<\2\2_\24\3\2\2\2`a\7@\2\2a\26"+
		"\3\2\2\2bd\7\60\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\5\31\r\2f\30\3\2\2"+
		"\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2k\32\3\2\2\2ln\t"+
		"\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\16\2\2r\34"+
		"\3\2\2\2\b\2\37!cho\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}