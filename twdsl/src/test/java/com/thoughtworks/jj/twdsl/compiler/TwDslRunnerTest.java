package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.tokens.PhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhrasesToken;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class TwDslRunnerTest {

    @Mock
    private RuntimeCommandObserver runCommandObserver;

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void notifyExecutionOfPhrases() throws Exception {
        PhrasesToken phrasesToken = new PhrasesToken();
        PhraseToken phraseTokenA = mock(PhraseToken.class);
        PhraseToken phraseTokenB = mock(PhraseToken.class);

        when(phraseTokenA.identifier()).thenReturn("createArea");
        when(phraseTokenB.identifier()).thenReturn("createAction");

        phrasesToken.getPhraseTokens().add(phraseTokenA);
        phrasesToken.getPhraseTokens().add(phraseTokenB);

        TwDslRunner twDslRunner = new TwDslRunner(runCommandObserver);
        twDslRunner.run(phrasesToken);

        verify(runCommandObserver).notify(eq("createArea"), any(TwDslRuntime.class), eq(phraseTokenA));
        verify(runCommandObserver).notify(eq("createAction"), any(TwDslRuntime.class), eq(phraseTokenB));
    }
}