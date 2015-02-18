// Generated from /Users/msilveir/personal/Dropbox/protected/source/journeyjournal/jarvis/src/main/antlr/Jarvis.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.jarvis.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JarvisParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, CAPABILITY_DESCRIPTOR=9, 
		GOALS_DESCRIPTOR=10, HIGHLIGH_DESCRIPTOR=11, TOPIC_DESCRIPTOR=12, GREAT_FEEDBACK_DESCRIPTOR=13, 
		CONSTRUCTIVE_FEEDBACK_DESCRIPTOR=14, TASKS_DESCRIPTOR=15, FROM_DESCRIPTOR=16, 
		CONNECTOR=17, DIGIT=18, IDENTIFIER=19, NEW_LINE=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'!'", "'('", "')'", "':'", "','", "'-'", "'.'", "CAPABILITY_DESCRIPTOR", 
		"GOALS_DESCRIPTOR", "HIGHLIGH_DESCRIPTOR", "TOPIC_DESCRIPTOR", "'The great feedback that I got was:'", 
		"'The constructive feedback that I got was:'", "TASKS_DESCRIPTOR", "FROM_DESCRIPTOR", 
		"CONNECTOR", "DIGIT", "IDENTIFIER", "NEW_LINE", "WS"
	};
	public static final int
		RULE_phrases = 0, RULE_phrase = 1, RULE_capabilityPhrase = 2, RULE_goalsStartPhrase = 3, 
		RULE_highlightPhrase = 4, RULE_howToPhrase = 5, RULE_goalPhrase = 6, RULE_topicPhrase = 7, 
		RULE_feedbackPhrase = 8, RULE_greatFeedbackPhrase = 9, RULE_constructiveFeedbackPhase = 10, 
		RULE_fromPhrase = 11, RULE_itemPhrase = 12, RULE_missionDescription = 13;
	public static final String[] ruleNames = {
		"phrases", "phrase", "capabilityPhrase", "goalsStartPhrase", "highlightPhrase", 
		"howToPhrase", "goalPhrase", "topicPhrase", "feedbackPhrase", "greatFeedbackPhrase", 
		"constructiveFeedbackPhase", "fromPhrase", "itemPhrase", "missionDescription"
	};

	@Override
	public String getGrammarFileName() { return "Jarvis.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JarvisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PhrasesContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public TerminalNode NEW_LINE(int i) {
			return getToken(JarvisParser.NEW_LINE, i);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(JarvisParser.NEW_LINE); }
		public PhrasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitPhrases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhrasesContext phrases() throws RecognitionException {
		PhrasesContext _localctx = new PhrasesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_phrases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				switch (_input.LA(1)) {
				case 1:
				case 7:
				case CAPABILITY_DESCRIPTOR:
				case GOALS_DESCRIPTOR:
				case HIGHLIGH_DESCRIPTOR:
				case TOPIC_DESCRIPTOR:
				case GREAT_FEEDBACK_DESCRIPTOR:
				case CONSTRUCTIVE_FEEDBACK_DESCRIPTOR:
				case TASKS_DESCRIPTOR:
				case FROM_DESCRIPTOR:
				case DIGIT:
					{
					setState(28); phrase();
					}
					break;
				case NEW_LINE:
					{
					setState(29); match(NEW_LINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 7) | (1L << CAPABILITY_DESCRIPTOR) | (1L << GOALS_DESCRIPTOR) | (1L << HIGHLIGH_DESCRIPTOR) | (1L << TOPIC_DESCRIPTOR) | (1L << GREAT_FEEDBACK_DESCRIPTOR) | (1L << CONSTRUCTIVE_FEEDBACK_DESCRIPTOR) | (1L << TASKS_DESCRIPTOR) | (1L << FROM_DESCRIPTOR) | (1L << DIGIT) | (1L << NEW_LINE))) != 0) );
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

	public static class PhraseContext extends ParserRuleContext {
		public GoalPhraseContext goalPhrase() {
			return getRuleContext(GoalPhraseContext.class,0);
		}
		public CapabilityPhraseContext capabilityPhrase() {
			return getRuleContext(CapabilityPhraseContext.class,0);
		}
		public ItemPhraseContext itemPhrase() {
			return getRuleContext(ItemPhraseContext.class,0);
		}
		public HighlightPhraseContext highlightPhrase() {
			return getRuleContext(HighlightPhraseContext.class,0);
		}
		public TopicPhraseContext topicPhrase() {
			return getRuleContext(TopicPhraseContext.class,0);
		}
		public FeedbackPhraseContext feedbackPhrase() {
			return getRuleContext(FeedbackPhraseContext.class,0);
		}
		public HowToPhraseContext howToPhrase() {
			return getRuleContext(HowToPhraseContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(JarvisParser.NEW_LINE, 0); }
		public GoalsStartPhraseContext goalsStartPhrase() {
			return getRuleContext(GoalsStartPhraseContext.class,0);
		}
		public FromPhraseContext fromPhrase() {
			return getRuleContext(FromPhraseContext.class,0);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34); capabilityPhrase();
				}
				break;

			case 2:
				{
				setState(35); goalsStartPhrase();
				}
				break;

			case 3:
				{
				setState(36); goalPhrase();
				}
				break;

			case 4:
				{
				setState(37); highlightPhrase();
				}
				break;

			case 5:
				{
				setState(38); topicPhrase();
				}
				break;

			case 6:
				{
				setState(39); feedbackPhrase();
				}
				break;

			case 7:
				{
				setState(40); fromPhrase();
				}
				break;

			case 8:
				{
				setState(41); howToPhrase();
				}
				break;

			case 9:
				{
				setState(42); itemPhrase();
				}
				break;
			}
			setState(46);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(45); match(8);
				}
			}

			setState(48); match(NEW_LINE);
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

	public static class CapabilityPhraseContext extends ParserRuleContext {
		public MissionDescriptionContext missionDescription() {
			return getRuleContext(MissionDescriptionContext.class,0);
		}
		public TerminalNode CAPABILITY_DESCRIPTOR() { return getToken(JarvisParser.CAPABILITY_DESCRIPTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JarvisParser.IDENTIFIER, 0); }
		public CapabilityPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capabilityPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitCapabilityPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapabilityPhraseContext capabilityPhrase() throws RecognitionException {
		CapabilityPhraseContext _localctx = new CapabilityPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_capabilityPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(CAPABILITY_DESCRIPTOR);
			{
			setState(51); match(IDENTIFIER);
			}
			setState(52); missionDescription();
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

	public static class GoalsStartPhraseContext extends ParserRuleContext {
		public TerminalNode GOALS_DESCRIPTOR() { return getToken(JarvisParser.GOALS_DESCRIPTOR, 0); }
		public GoalsStartPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalsStartPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitGoalsStartPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalsStartPhraseContext goalsStartPhrase() throws RecognitionException {
		GoalsStartPhraseContext _localctx = new GoalsStartPhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_goalsStartPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(GOALS_DESCRIPTOR);
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

	public static class HighlightPhraseContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public TerminalNode HIGHLIGH_DESCRIPTOR() { return getToken(JarvisParser.HIGHLIGH_DESCRIPTOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public HighlightPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highlightPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitHighlightPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighlightPhraseContext highlightPhrase() throws RecognitionException {
		HighlightPhraseContext _localctx = new HighlightPhraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_highlightPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(HIGHLIGH_DESCRIPTOR);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0) );
			setState(62); match(5);
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

	public static class HowToPhraseContext extends ParserRuleContext {
		public TerminalNode TASKS_DESCRIPTOR() { return getToken(JarvisParser.TASKS_DESCRIPTOR, 0); }
		public HowToPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_howToPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitHowToPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HowToPhraseContext howToPhrase() throws RecognitionException {
		HowToPhraseContext _localctx = new HowToPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_howToPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(TASKS_DESCRIPTOR);
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

	public static class GoalPhraseContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public GoalPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitGoalPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalPhraseContext goalPhrase() throws RecognitionException {
		GoalPhraseContext _localctx = new GoalPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_goalPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(66); match(1);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(DIGIT);
			setState(73); match(8);
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74); match(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0) );
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

	public static class TopicPhraseContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode TOPIC_DESCRIPTOR() { return getToken(JarvisParser.TOPIC_DESCRIPTOR, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public TopicPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topicPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitTopicPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopicPhraseContext topicPhrase() throws RecognitionException {
		TopicPhraseContext _localctx = new TopicPhraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topicPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(TOPIC_DESCRIPTOR);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0) );
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

	public static class FeedbackPhraseContext extends ParserRuleContext {
		public ConstructiveFeedbackPhaseContext constructiveFeedbackPhase() {
			return getRuleContext(ConstructiveFeedbackPhaseContext.class,0);
		}
		public GreatFeedbackPhraseContext greatFeedbackPhrase() {
			return getRuleContext(GreatFeedbackPhraseContext.class,0);
		}
		public FeedbackPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedbackPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitFeedbackPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackPhraseContext feedbackPhrase() throws RecognitionException {
		FeedbackPhraseContext _localctx = new FeedbackPhraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_feedbackPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch (_input.LA(1)) {
			case GREAT_FEEDBACK_DESCRIPTOR:
				{
				setState(90); greatFeedbackPhrase();
				}
				break;
			case CONSTRUCTIVE_FEEDBACK_DESCRIPTOR:
				{
				setState(91); constructiveFeedbackPhase();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GreatFeedbackPhraseContext extends ParserRuleContext {
		public TerminalNode GREAT_FEEDBACK_DESCRIPTOR() { return getToken(JarvisParser.GREAT_FEEDBACK_DESCRIPTOR, 0); }
		public GreatFeedbackPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greatFeedbackPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitGreatFeedbackPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreatFeedbackPhraseContext greatFeedbackPhrase() throws RecognitionException {
		GreatFeedbackPhraseContext _localctx = new GreatFeedbackPhraseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_greatFeedbackPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(GREAT_FEEDBACK_DESCRIPTOR);
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

	public static class ConstructiveFeedbackPhaseContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTIVE_FEEDBACK_DESCRIPTOR() { return getToken(JarvisParser.CONSTRUCTIVE_FEEDBACK_DESCRIPTOR, 0); }
		public ConstructiveFeedbackPhaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructiveFeedbackPhase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitConstructiveFeedbackPhase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructiveFeedbackPhaseContext constructiveFeedbackPhase() throws RecognitionException {
		ConstructiveFeedbackPhaseContext _localctx = new ConstructiveFeedbackPhaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructiveFeedbackPhase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(CONSTRUCTIVE_FEEDBACK_DESCRIPTOR);
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

	public static class FromPhraseContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public TerminalNode FROM_DESCRIPTOR() { return getToken(JarvisParser.FROM_DESCRIPTOR, 0); }
		public FromPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitFromPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromPhraseContext fromPhrase() throws RecognitionException {
		FromPhraseContext _localctx = new FromPhraseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fromPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(FROM_DESCRIPTOR);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0) );
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

	public static class ItemPhraseContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public ItemPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitItemPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemPhraseContext itemPhrase() throws RecognitionException {
		ItemPhraseContext _localctx = new ItemPhraseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_itemPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(104); match(1);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(7);
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class MissionDescriptionContext extends ParserRuleContext {
		public TerminalNode CONNECTOR() { return getToken(JarvisParser.CONNECTOR, 0); }
		public TerminalNode DIGIT(int i) {
			return getToken(JarvisParser.DIGIT, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JarvisParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(JarvisParser.DIGIT); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JarvisParser.IDENTIFIER); }
		public MissionDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missionDescription; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JarvisVisitor ) return ((JarvisVisitor<? extends T>)visitor).visitMissionDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissionDescriptionContext missionDescription() throws RecognitionException {
		MissionDescriptionContext _localctx = new MissionDescriptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_missionDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(CONNECTOR);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << DIGIT) | (1L << IDENTIFIER))) != 0) );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\7\3\7\3\b\7\bF\n\b"+
		"\f\b\16\bI\13\b\3\b\3\b\3\b\6\bN\n\b\r\b\16\bO\3\b\6\bS\n\b\r\b\16\bT"+
		"\3\t\3\t\6\tY\n\t\r\t\16\tZ\3\n\3\n\5\n_\n\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\6\rg\n\r\r\r\16\rh\3\16\7\16l\n\16\f\16\16\16o\13\16\3\16\3\16\6\16s"+
		"\n\16\r\16\16\16t\3\17\3\17\6\17y\n\17\r\17\16\17z\3\17\2\2\20\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\2\4\4\2\3\3\24\25\4\2\3\n\24\25\u0083\2 "+
		"\3\2\2\2\4-\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16G"+
		"\3\2\2\2\20V\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32"+
		"m\3\2\2\2\34v\3\2\2\2\36!\5\4\3\2\37!\7\26\2\2 \36\3\2\2\2 \37\3\2\2\2"+
		"!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$.\5\6\4\2%.\5\b\5\2&.\5\16"+
		"\b\2\'.\5\n\6\2(.\5\20\t\2).\5\22\n\2*.\5\30\r\2+.\5\f\7\2,.\5\32\16\2"+
		"-$\3\2\2\2-%\3\2\2\2-&\3\2\2\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2"+
		"\2-+\3\2\2\2-,\3\2\2\2.\60\3\2\2\2/\61\7\n\2\2\60/\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\3\2\2\2\62\63\7\26\2\2\63\5\3\2\2\2\64\65\7\13\2\2\65\66\7\25"+
		"\2\2\66\67\5\34\17\2\67\7\3\2\2\289\7\f\2\29\t\3\2\2\2:<\7\r\2\2;=\t\2"+
		"\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\7\2\2A\13\3"+
		"\2\2\2BC\7\21\2\2C\r\3\2\2\2DF\7\3\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2G"+
		"H\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\24\2\2KM\7\n\2\2LN\7\3\2\2ML\3\2\2\2"+
		"NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VX\7\16\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\21\3\2\2\2\\_\5\24\13\2]_\5\26\f\2^\\\3\2\2"+
		"\2^]\3\2\2\2_\23\3\2\2\2`a\7\17\2\2a\25\3\2\2\2bc\7\20\2\2c\27\3\2\2\2"+
		"df\7\22\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\31\3\2"+
		"\2\2jl\7\3\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pr\7\t\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\33\3"+
		"\2\2\2vx\7\23\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\35"+
		"\3\2\2\2\20 \"-\60>GOTZ^hmtz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}