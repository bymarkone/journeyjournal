// Generated from /Users/aarni/Documents/tw/journeyjournal/twdsl/src/main/antlr/TwDsl.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.twdsl.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TwDslParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, DESCRIPTION=3, VERBS=4, OBJECTS=5, CONJUNCTIONS=6, FACT=7, 
		ABOUT=8, IDENTIFIERS=9, QUOTED=10, QUOTE=11, END_LINE=12, NEW_LINE=13, 
		WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'on time'", "'for topic'", "DESCRIPTION", "VERBS", "OBJECTS", 
		"CONJUNCTIONS", "'Fact'", "'about'", "IDENTIFIERS", "QUOTED", "QUOTE", 
		"END_LINE", "NEW_LINE", "WS"
	};
	public static final int
		RULE_phrases = 0, RULE_phrase = 1, RULE_genericPhrase = 2, RULE_feedbackPhrase = 3, 
		RULE_factPhrase = 4, RULE_factTopic = 5, RULE_factTime = 6, RULE_verb = 7, 
		RULE_object = 8, RULE_names = 9, RULE_name = 10, RULE_properties = 11, 
		RULE_property = 12, RULE_property_name = 13, RULE_property_value = 14, 
		RULE_conjunction = 15, RULE_end_line = 16;
	public static final String[] ruleNames = {
		"phrases", "phrase", "genericPhrase", "feedbackPhrase", "factPhrase", 
		"factTopic", "factTime", "verb", "object", "names", "name", "properties", 
		"property", "property_name", "property_value", "conjunction", "end_line"
	};

	@Override
	public String getGrammarFileName() { return "TwDsl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TwDslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PhrasesContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public TerminalNode NEW_LINE(int i) {
			return getToken(TwDslParser.NEW_LINE, i);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(TwDslParser.NEW_LINE); }
		public PhrasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitPhrases(this);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				switch (_input.LA(1)) {
				case VERBS:
					{
					setState(34); phrase();
					}
					break;
				case NEW_LINE:
					{
					setState(35); match(NEW_LINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VERBS || _la==NEW_LINE );
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
		public FactPhraseContext factPhrase() {
			return getRuleContext(FactPhraseContext.class,0);
		}
		public End_lineContext end_line() {
			return getRuleContext(End_lineContext.class,0);
		}
		public FeedbackPhraseContext feedbackPhrase() {
			return getRuleContext(FeedbackPhraseContext.class,0);
		}
		public GenericPhraseContext genericPhrase() {
			return getRuleContext(GenericPhraseContext.class,0);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(40); genericPhrase();
				}
				break;

			case 2:
				{
				setState(41); feedbackPhrase();
				}
				break;

			case 3:
				{
				setState(42); factPhrase();
				}
				break;
			}
			setState(45); end_line();
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

	public static class GenericPhraseContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public GenericPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitGenericPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericPhraseContext genericPhrase() throws RecognitionException {
		GenericPhraseContext _localctx = new GenericPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); verb();
			setState(48); object();
			setState(50);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS || _la==QUOTED) {
				{
				setState(49); names();
				}
			}

			setState(53);
			_la = _input.LA(1);
			if (_la==CONJUNCTIONS) {
				{
				setState(52); properties();
				}
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

	public static class FeedbackPhraseContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DESCRIPTION() { return getToken(TwDslParser.DESCRIPTION, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public FeedbackPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feedbackPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitFeedbackPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeedbackPhraseContext feedbackPhrase() throws RecognitionException {
		FeedbackPhraseContext _localctx = new FeedbackPhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feedbackPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); verb();
			setState(56); object();
			setState(57); property();
			setState(58); match(DESCRIPTION);
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

	public static class FactPhraseContext extends ParserRuleContext {
		public FactTopicContext factTopic(int i) {
			return getRuleContext(FactTopicContext.class,i);
		}
		public List<FactTimeContext> factTime() {
			return getRuleContexts(FactTimeContext.class);
		}
		public List<FactTopicContext> factTopic() {
			return getRuleContexts(FactTopicContext.class);
		}
		public FactTimeContext factTime(int i) {
			return getRuleContext(FactTimeContext.class,i);
		}
		public TerminalNode FACT() { return getToken(TwDslParser.FACT, 0); }
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public FactPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factPhrase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitFactPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactPhraseContext factPhrase() throws RecognitionException {
		FactPhraseContext _localctx = new FactPhraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); verb();
			setState(61); match(FACT);
			setState(63);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS || _la==QUOTED) {
				{
				setState(62); names();
				}
			}

			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(67);
				switch (_input.LA(1)) {
				case 2:
					{
					setState(65); factTopic();
					}
					break;
				case 1:
					{
					setState(66); factTime();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 || _la==2 );
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

	public static class FactTopicContext extends ParserRuleContext {
		public TerminalNode QUOTED() { return getToken(TwDslParser.QUOTED, 0); }
		public FactTopicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factTopic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitFactTopic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactTopicContext factTopic() throws RecognitionException {
		FactTopicContext _localctx = new FactTopicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factTopic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(2);
			setState(72); match(QUOTED);
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

	public static class FactTimeContext extends ParserRuleContext {
		public TerminalNode QUOTED() { return getToken(TwDslParser.QUOTED, 0); }
		public FactTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitFactTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactTimeContext factTime() throws RecognitionException {
		FactTimeContext _localctx = new FactTimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(1);
			setState(75); match(QUOTED);
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode VERBS() { return getToken(TwDslParser.VERBS, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(VERBS);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECTS() { return getToken(TwDslParser.OBJECTS, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(OBJECTS);
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

	public static class NamesContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode QUOTED() { return getToken(TwDslParser.QUOTED, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_names);
		int _la;
		try {
			setState(87);
			switch (_input.LA(1)) {
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81); name();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIERS );
				}
				break;
			case QUOTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(QUOTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TwDslParser.IDENTIFIERS, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(IDENTIFIERS);
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

	public static class PropertiesContext extends ParserRuleContext {
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91); conjunction();
				setState(92); property();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONJUNCTIONS );
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

	public static class PropertyContext extends ParserRuleContext {
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); property_name();
			setState(99); property_value();
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

	public static class Property_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TwDslParser.IDENTIFIERS, 0); }
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_property_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(IDENTIFIERS);
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

	public static class Property_valueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(TwDslParser.IDENTIFIERS, 0); }
		public TerminalNode QUOTED() { return getToken(TwDslParser.QUOTED, 0); }
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_property_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIERS || _la==QUOTED) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode CONJUNCTIONS() { return getToken(TwDslParser.CONJUNCTIONS, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(CONJUNCTIONS);
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

	public static class End_lineContext extends ParserRuleContext {
		public TerminalNode END_LINE() { return getToken(TwDslParser.END_LINE, 0); }
		public End_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TwDslVisitor ) return ((TwDslVisitor<? extends T>)visitor).visitEnd_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_lineContext end_line() throws RecognitionException {
		End_lineContext _localctx = new End_lineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_end_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(END_LINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\4\3\4\3\4\5\4\65"+
		"\n\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6B\n\6\3\6\3\6\6\6"+
		"F\n\6\r\6\16\6G\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13U\n\13"+
		"\r\13\16\13V\3\13\5\13Z\n\13\3\f\3\f\3\r\3\r\3\r\6\ra\n\r\r\r\16\rb\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\13\fj\2&\3\2\2\2\4-\3\2"+
		"\2\2\6\61\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20O\3\2"+
		"\2\2\22Q\3\2\2\2\24Y\3\2\2\2\26[\3\2\2\2\30`\3\2\2\2\32d\3\2\2\2\34g\3"+
		"\2\2\2\36i\3\2\2\2 k\3\2\2\2\"m\3\2\2\2$\'\5\4\3\2%\'\7\17\2\2&$\3\2\2"+
		"\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*.\5\6\4\2+.\5\b"+
		"\5\2,.\5\n\6\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\5\"\22\2\60"+
		"\5\3\2\2\2\61\62\5\20\t\2\62\64\5\22\n\2\63\65\5\24\13\2\64\63\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\3\2\2\2\668\5\30\r\2\67\66\3\2\2\2\678\3\2\2\28\7"+
		"\3\2\2\29:\5\20\t\2:;\5\22\n\2;<\5\32\16\2<=\7\5\2\2=\t\3\2\2\2>?\5\20"+
		"\t\2?A\7\t\2\2@B\5\24\13\2A@\3\2\2\2AB\3\2\2\2BE\3\2\2\2CF\5\f\7\2DF\5"+
		"\16\b\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2"+
		"IJ\7\4\2\2JK\7\f\2\2K\r\3\2\2\2LM\7\3\2\2MN\7\f\2\2N\17\3\2\2\2OP\7\6"+
		"\2\2P\21\3\2\2\2QR\7\7\2\2R\23\3\2\2\2SU\5\26\f\2TS\3\2\2\2UV\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XZ\7\f\2\2YT\3\2\2\2YX\3\2\2\2Z\25\3\2\2"+
		"\2[\\\7\13\2\2\\\27\3\2\2\2]^\5 \21\2^_\5\32\16\2_a\3\2\2\2`]\3\2\2\2"+
		"ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\31\3\2\2\2de\5\34\17\2ef\5\36\20\2f\33"+
		"\3\2\2\2gh\7\13\2\2h\35\3\2\2\2ij\t\2\2\2j\37\3\2\2\2kl\7\b\2\2l!\3\2"+
		"\2\2mn\7\16\2\2n#\3\2\2\2\r&(-\64\67AEGVYb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}