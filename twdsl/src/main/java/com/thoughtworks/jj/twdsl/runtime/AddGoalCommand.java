package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.ActionItem;
import com.thoughtworks.jj.twdsl.domain.Goal;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.GenericPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

import java.util.ArrayList;

public class AddGoalCommand implements PhraseRuntimeCommand {

    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        GenericPhraseToken token = (GenericPhraseToken) phraseToken;
        Goal goal = new Goal(token.getNamesToken().getName(), new ArrayList<ActionItem>());

        Repository.capabilities.stream().reduce((previous, current)-> current).get().getGoals().add(goal); // buuuu
    }
}
