package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

public interface PhraseRuntimeCommand {
    void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken);
}
