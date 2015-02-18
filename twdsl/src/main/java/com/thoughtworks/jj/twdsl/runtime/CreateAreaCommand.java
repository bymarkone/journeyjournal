package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.Area;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.GenericPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

public class CreateAreaCommand implements PhraseRuntimeCommand {
    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        GenericPhraseToken token = (GenericPhraseToken) phraseToken;
        Area area = new Area(token.getNamesToken().getName());

        Repository.areas.add(area); // buuuu
    }
}
