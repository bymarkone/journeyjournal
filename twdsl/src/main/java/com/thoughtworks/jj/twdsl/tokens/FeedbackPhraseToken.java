package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;

@Getter
public class FeedbackPhraseToken extends PhraseToken {

    private String description;

    public FeedbackPhraseToken(String description) {
        this.description = description;
        propertiesToken = new PropertiesToken();
    }

    @Override
    public String identifier() {
        return verbToken.getVerb().concat(objectToken.getObject());
    }
}
