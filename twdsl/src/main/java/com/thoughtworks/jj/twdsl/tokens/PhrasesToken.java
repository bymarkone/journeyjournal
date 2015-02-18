package com.thoughtworks.jj.twdsl.tokens;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @ToString
public class PhrasesToken {

    private List<PhraseToken> phraseTokens;

    public PhrasesToken() {
        this.phraseTokens = new ArrayList<>();
    }

}
