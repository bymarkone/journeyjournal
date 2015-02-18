package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.tokens.PhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhrasesToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TwDslRunner {

    private RuntimeCommandObserver runtimeCommandObserver;

    @Autowired
    public TwDslRunner(RuntimeCommandObserver runtimeCommandObserver) {
        this.runtimeCommandObserver = runtimeCommandObserver;
    }

    public void run(PhrasesToken phrasesToken) {
        TwDslRuntime twDslRuntime = new TwDslRuntime();

        List<PhraseToken> phraseTokens = phrasesToken.getPhraseTokens();
        phraseTokens.stream().forEachOrdered(phraseToken -> runtimeCommandObserver.notify(phraseToken.identifier(), twDslRuntime, phraseToken));
    }
}
