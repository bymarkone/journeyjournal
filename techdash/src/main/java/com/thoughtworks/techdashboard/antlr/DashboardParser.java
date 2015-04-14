// Generated from /Users/msilveir/personal/Dropbox/marcos/source/journeyjournal/techdash/src/main/antlr/Dashboard.g4 by ANTLR 4.2.2
package com.thoughtworks.techdashboard.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DashboardParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ACCOUNT=2, PROJECT=3, TECH_LEAD=4, TECHNOLOGY=5, BUSINESS_DOMAIN=6, 
		TWO_DASHES=7, DASH=8, COLON=9, CHEVRON=10, END_LINE=11, NEW_LINE=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "'Account'", "'Project'", "'TechLead'", "'Technologies'", 
		"'BusinessDomains'", "TWO_DASHES", "'-'", "':'", "'>'", "END_LINE", "NEW_LINE", 
		"WS"
	};
	public static final int
		RULE_lines = 0, RULE_line = 1, RULE_city = 2, RULE_account = 3, RULE_project = 4, 
		RULE_techLead = 5, RULE_technology = 6, RULE_businessDomain = 7;
	public static final String[] ruleNames = {
		"lines", "line", "city", "account", "project", "techLead", "technology", 
		"businessDomain"
	};

	@Override
	public String getGrammarFileName() { return "Dashboard.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DashboardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LinesContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROJECT) | (1L << TECH_LEAD) | (1L << TECHNOLOGY) | (1L << BUSINESS_DOMAIN) | (1L << CHEVRON))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public CityContext city() {
			return getRuleContext(CityContext.class,0);
		}
		public TechLeadContext techLead() {
			return getRuleContext(TechLeadContext.class,0);
		}
		public TechnologyContext technology() {
			return getRuleContext(TechnologyContext.class,0);
		}
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(DashboardParser.END_LINE, 0); }
		public BusinessDomainContext businessDomain() {
			return getRuleContext(BusinessDomainContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			switch (_input.LA(1)) {
			case CHEVRON:
				{
				setState(21); city();
				}
				break;
			case PROJECT:
				{
				setState(22); project();
				}
				break;
			case TECH_LEAD:
				{
				setState(23); techLead();
				}
				break;
			case TECHNOLOGY:
				{
				setState(24); technology();
				}
				break;
			case BUSINESS_DOMAIN:
				{
				setState(25); businessDomain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(28); match(END_LINE);
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

	public static class CityContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode CHEVRON() { return getToken(DashboardParser.CHEVRON, 0); }
		public CityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitCity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CityContext city() throws RecognitionException {
		CityContext _localctx = new CityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_city);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(CHEVRON);
			setState(31); match(ID);
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

	public static class AccountContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode ACCOUNT() { return getToken(DashboardParser.ACCOUNT, 0); }
		public TerminalNode COLON() { return getToken(DashboardParser.COLON, 0); }
		public TerminalNode TWO_DASHES() { return getToken(DashboardParser.TWO_DASHES, 0); }
		public AccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitAccount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccountContext account() throws RecognitionException {
		AccountContext _localctx = new AccountContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_account);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(TWO_DASHES);
			setState(34); match(ACCOUNT);
			setState(35); match(COLON);
			setState(36); match(ID);
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

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DashboardParser.COLON, 0); }
		public TerminalNode PROJECT() { return getToken(DashboardParser.PROJECT, 0); }
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(PROJECT);
			setState(39); match(COLON);
			setState(40); match(ID);
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

	public static class TechLeadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DashboardParser.COLON, 0); }
		public TerminalNode TECH_LEAD() { return getToken(DashboardParser.TECH_LEAD, 0); }
		public TechLeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_techLead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitTechLead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TechLeadContext techLead() throws RecognitionException {
		TechLeadContext _localctx = new TechLeadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_techLead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(TECH_LEAD);
			setState(43); match(COLON);
			setState(44); match(ID);
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

	public static class TechnologyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode TECHNOLOGY() { return getToken(DashboardParser.TECHNOLOGY, 0); }
		public TerminalNode COLON() { return getToken(DashboardParser.COLON, 0); }
		public TechnologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_technology; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitTechnology(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TechnologyContext technology() throws RecognitionException {
		TechnologyContext _localctx = new TechnologyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_technology);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(TECHNOLOGY);
			setState(47); match(COLON);
			setState(48); match(ID);
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

	public static class BusinessDomainContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DashboardParser.ID, 0); }
		public TerminalNode BUSINESS_DOMAIN() { return getToken(DashboardParser.BUSINESS_DOMAIN, 0); }
		public TerminalNode COLON() { return getToken(DashboardParser.COLON, 0); }
		public BusinessDomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_businessDomain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DashboardVisitor ) return ((DashboardVisitor<? extends T>)visitor).visitBusinessDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BusinessDomainContext businessDomain() throws RecognitionException {
		BusinessDomainContext _localctx = new BusinessDomainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_businessDomain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(BUSINESS_DOMAIN);
			setState(51); match(COLON);
			setState(52); match(ID);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\179\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\65\2\23\3\2\2\2\4\34\3\2\2\2\6 \3"+
		"\2\2\2\b#\3\2\2\2\n(\3\2\2\2\f,\3\2\2\2\16\60\3\2\2\2\20\64\3\2\2\2\22"+
		"\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\3\3\2\2\2\27\35\5\6\4\2\30\35\5\n\6\2\31\35\5\f\7\2\32\35\5\16\b\2\33"+
		"\35\5\20\t\2\34\27\3\2\2\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34"+
		"\33\3\2\2\2\35\36\3\2\2\2\36\37\7\r\2\2\37\5\3\2\2\2 !\7\f\2\2!\"\7\3"+
		"\2\2\"\7\3\2\2\2#$\7\t\2\2$%\7\4\2\2%&\7\13\2\2&\'\7\3\2\2\'\t\3\2\2\2"+
		"()\7\5\2\2)*\7\13\2\2*+\7\3\2\2+\13\3\2\2\2,-\7\6\2\2-.\7\13\2\2./\7\3"+
		"\2\2/\r\3\2\2\2\60\61\7\7\2\2\61\62\7\13\2\2\62\63\7\3\2\2\63\17\3\2\2"+
		"\2\64\65\7\b\2\2\65\66\7\13\2\2\66\67\7\3\2\2\67\21\3\2\2\2\4\25\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}