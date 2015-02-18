package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.PhraseRuntimeCommand;
import com.thoughtworks.jj.twdsl.compiler.TwDslRuntime;
import com.thoughtworks.jj.twdsl.domain.Feedback;
import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.tokens.FeedbackPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

public class ReceiveConstructiveFeedbackCommand implements PhraseRuntimeCommand {
    @Override
    public void execute(TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        FeedbackPhraseToken token = (FeedbackPhraseToken) phraseToken;
        Feedback feedback = new Feedback(token.getDescription(), token.propertyTokenByName("from").get().getPropertyValue(), "Constructive");
        Repository.feedback.add(feedback); // buuuu
    }
}
