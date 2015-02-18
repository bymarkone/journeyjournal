package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.tokens.PhraseToken;

import java.util.*;

public class RuntimeCommandObserver {
    private Map<String, List<PhraseRuntimeCommand>> observables;

    public RuntimeCommandObserver() {
        observables = new HashMap<>();
    }

    public void addObservable(String name, PhraseRuntimeCommand runtimeCommand) {
        if (!observables.containsKey(name)) {
            observables.put(name, new ArrayList<>());
        }
        observables.get(name).add(runtimeCommand);
    }

    public void notify(String name, TwDslRuntime twDslRuntime, PhraseToken phraseToken) {
        Optional.ofNullable(observables.get(name)).ifPresent(runtimeCommands ->
                runtimeCommands.stream().forEachOrdered(command -> command.execute(twDslRuntime, phraseToken)));
    }
}
