package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.antlr.TwDslBaseVisitor;
import com.thoughtworks.jj.twdsl.antlr.TwDslParser;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.*;
import lombok.Getter;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TwDslInterpreter extends TwDslBaseVisitor<Void> {

    @Getter
    private PhrasesToken phrasesToken;
    private PhraseToken lastPhraseToken;

    @Override
    public Void visitPhrases(@NotNull TwDslParser.PhrasesContext ctx) {
        phrasesToken = new PhrasesToken();
        return super.visitPhrases(ctx);
    }

    @Override
    public Void visitPhrase(@NotNull TwDslParser.PhraseContext ctx) {
        Repository.areas = new ArrayList<>();
        Repository.capabilities = new ArrayList<>();
        return super.visitPhrase(ctx);
    }

    @Override
    public Void visitGenericPhrase(@NotNull TwDslParser.GenericPhraseContext ctx) {
        PhraseToken phraseToken = new GenericPhraseToken();
        phrasesToken.getPhraseTokens().add(phraseToken);
        lastPhraseToken = phraseToken;
        return super.visitGenericPhrase(ctx);
    }

    @Override
    public Void visitFactPhrase(@NotNull TwDslParser.FactPhraseContext ctx) {
        PhraseToken phraseToken = new FactPhraseToken();
        phrasesToken.getPhraseTokens().add(phraseToken);
        lastPhraseToken = phraseToken;
        return super.visitFactPhrase(ctx);
    }

    @Override
    public Void visitFactTime(@NotNull TwDslParser.FactTimeContext ctx) {
        ((FactPhraseToken)lastPhraseToken).setFactTime(cleanQuotes(ctx.QUOTED().getText()));
        return super.visitFactTime(ctx);
    }

    @Override
    public Void visitFactTopic(@NotNull TwDslParser.FactTopicContext ctx) {
        ((FactPhraseToken)lastPhraseToken).setFactTopic(cleanQuotes(ctx.QUOTED().getText()));
        return super.visitFactTopic(ctx);
    }

    @Override
    public Void visitVerb(@NotNull TwDslParser.VerbContext ctx) {
        VerbToken verbToken = new VerbToken(ctx.getText());
        lastPhraseToken.setVerbToken(verbToken);
        return super.visitVerb(ctx);
    }

    @Override
    public Void visitObject(@NotNull TwDslParser.ObjectContext ctx) {
        ObjectToken objectToken = new ObjectToken(ctx.getText());
        lastPhraseToken.setObjectToken(objectToken);
        return super.visitObject(ctx);
    }

    @Override
    public Void visitFeedbackPhrase(@NotNull TwDslParser.FeedbackPhraseContext ctx) {
        FeedbackPhraseToken feedbackPhraseToken = new FeedbackPhraseToken(buildDescription(ctx));
        phrasesToken.getPhraseTokens().add(feedbackPhraseToken);
        lastPhraseToken = feedbackPhraseToken;
        return super.visitFeedbackPhrase(ctx);
    }

    private String buildDescription(TwDslParser.FeedbackPhraseContext ctx) {
        return ctx.DESCRIPTION().getText().replaceAll(":", "").replaceAll("\n", "").trim();
    }

    @Override
    public Void visitNames(@NotNull TwDslParser.NamesContext ctx) {
        List<TwDslParser.NameContext> nameContexts = ctx.name();

        Optional<TerminalNode> quotedNode = Optional.ofNullable(ctx.QUOTED());
        quotedNode.map(ParseTree::getText)
                .ifPresent(text -> (lastPhraseToken).setNamesToken(new NamesToken(cleanQuotes(text))));
        if (!quotedNode.isPresent()) {
            String names = nameContexts.stream()
                    .map(RuleContext::getText)
                    .reduce("", (accum, item) -> accum.concat(item.concat(" ")))
                    .trim();
            NamesToken namesToken = new NamesToken(names);
            lastPhraseToken.setNamesToken(namesToken);
        }
        return super.visitNames(ctx);
    }

    @Override
    public Void visitProperty(@NotNull TwDslParser.PropertyContext ctx) {
        String name = ctx.property_name().getText();
        TwDslParser.Property_valueContext propertyValue = ctx.property_value();
        String value = Optional.ofNullable(propertyValue.IDENTIFIERS())
                .map(ParseTree::getText)
                .orElseGet(() -> cleanQuotes(propertyValue.QUOTED().getText()));
        PropertyToken propertyToken = new PropertyToken(name, value);
        lastPhraseToken.getPropertiesToken().getPropertyTokens().add(propertyToken);
        return super.visitProperty(ctx);
    }

    private String cleanQuotes(String text) {
        return text.substring(1, text.length() - 1);
    }
}
