package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.Fact;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.FactPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

public class RegisterFactCommand implements PhraseRuntimeCommand {
    public RegisterFactCommand() {
        super();
    }

    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        FactPhraseToken factToken = (FactPhraseToken) phraseToken;
        Fact fact = new Fact( factToken.getFactTopic(), factToken.getFactTime(),factToken.getNamesToken().getName());
        Repository.facts.add(fact);
    }
}
