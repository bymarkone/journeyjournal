package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter @ToString
public abstract class PhraseToken {

    @Setter
    protected VerbToken verbToken;

    @Setter
    protected NamesToken namesToken;

    @Setter
    protected ObjectToken objectToken;

    @Setter
    protected PropertiesToken propertiesToken;

    public Optional<PropertyToken> propertyTokenByName(String name) {
        return propertiesToken.getPropertyTokens().stream()
                .filter(token -> token.getPropertyName().equals(name))
                .findFirst();
    }

    public abstract String identifier();

}
