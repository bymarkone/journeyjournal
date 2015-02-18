package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.ActionItem;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.GenericPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

public class AddActionItemCommand implements PhraseRuntimeCommand {

    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        GenericPhraseToken token = (GenericPhraseToken) phraseToken;
        ActionItem actionItem = new ActionItem(token.getNamesToken().getName());

        Repository.capabilities.stream()
                .reduce((previous, current) -> current)
                .get()
                .getGoals()
                .stream()
                .reduce((previous, current) -> current)
                .get()
                .getActionItems()
                .add(actionItem); // buuuu
    }
}
