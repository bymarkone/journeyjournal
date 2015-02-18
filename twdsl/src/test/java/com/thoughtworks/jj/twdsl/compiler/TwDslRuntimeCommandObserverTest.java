package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.tokens.GenericPhraseToken;
import com.thoughtworks.jj.twdsl.tokens.PhraseToken;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TwDslRuntimeCommandObserverTest {

    @Test
    public void notifyObservers() throws Exception {
        RuntimeCommandObserver runtimeCommandObserver = new RuntimeCommandObserver();

        PhraseRuntimeCommand runtimeCommandA = mock(PhraseRuntimeCommand.class);
        runtimeCommandObserver.addObservable("createArea", runtimeCommandA);
        PhraseRuntimeCommand runtimeCommandB = mock(PhraseRuntimeCommand.class);
        runtimeCommandObserver.addObservable("createAction", runtimeCommandB);
        PhraseRuntimeCommand runtimeCommandC = mock(PhraseRuntimeCommand.class);
        runtimeCommandObserver.addObservable("createArea", runtimeCommandC);

        TwDslRuntime twDslRuntime = new TwDslRuntime();
        PhraseToken phraseToken = new GenericPhraseToken();
        runtimeCommandObserver.notify("createArea", twDslRuntime, phraseToken);

        verify(runtimeCommandA, times(1)).execute(twDslRuntime, phraseToken);
        verify(runtimeCommandC, times(1)).execute(twDslRuntime, phraseToken);
        verify(runtimeCommandB, times(0)).execute(twDslRuntime, phraseToken);
    }

}