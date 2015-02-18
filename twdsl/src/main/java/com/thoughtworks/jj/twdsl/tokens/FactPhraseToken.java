package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FactPhraseToken extends PhraseToken {
    String factTime;
    String factTopic;
    @Override
    public String identifier() {
        return verbToken.getVerb().concat("Fact");
    }
}
