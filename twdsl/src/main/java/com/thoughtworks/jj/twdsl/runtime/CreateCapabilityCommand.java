package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.Capability;
import com.thoughtworks.jj.twdsl.domain.Goal;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.GenericPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PropertyToken;

import java.util.ArrayList;

public class CreateCapabilityCommand implements PhraseRuntimeCommand {
    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        GenericPhraseToken token = (GenericPhraseToken) phraseToken;
        token.propertyTokenByName("mission").ifPresent(mission -> addCapability(token, mission));
    }

    private void addCapability(GenericPhraseToken token, PropertyToken mission) {
        Capability capability = new Capability(token.getNamesToken().getName(), mission.getPropertyValue(), new ArrayList<Goal>());
        Repository.capabilities.add(capability); // buuuu
    }
}
