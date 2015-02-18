package com.thoughtworks.jj.twdsl.runtime;

import com.thoughtworks.jj.twdsl.compiler.RuntimeCommandObserver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuntimeCommandsConfiguration {

    @Bean
    public RuntimeCommandObserver runtimeCommandObserver() {
        RuntimeCommandObserver runtimeCommandObserver = new RuntimeCommandObserver();
        runtimeCommandObserver.addObservable("createArea", new CreateAreaCommand());
        runtimeCommandObserver.addObservable("createCapability", new CreateCapabilityCommand());
        runtimeCommandObserver.addObservable("addGoal", new AddGoalCommand());
        runtimeCommandObserver.addObservable("addAction Item", new AddActionItemCommand());
        runtimeCommandObserver.addObservable("receiveGreat Feedback", new ReceiveGreatFeedbackCommand());
        runtimeCommandObserver.addObservable("receiveConstructive Feedback", new ReceiveConstructiveFeedbackCommand());
        runtimeCommandObserver.addObservable("registerFact", new RegisterFactCommand());
        return runtimeCommandObserver;
    }

}
