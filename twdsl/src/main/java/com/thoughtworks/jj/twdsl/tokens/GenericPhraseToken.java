package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter @Setter @ToString
public class GenericPhraseToken extends PhraseToken {

    public GenericPhraseToken() {
        propertiesToken = new PropertiesToken();
    }

    @Override
    public String identifier() {
        return verbToken.getVerb().concat(objectToken.getObject());
    }
}
