package com.thoughtworks.jj.jarvis.compiler;

import com.thoughtworks.jj.jarvis.antlr.JarvisBaseVisitor;
import com.thoughtworks.jj.jarvis.antlr.JarvisParser;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Optional;

@Getter
public class JarvisInterpreter extends JarvisBaseVisitor<Void> {

    StringBuilder content;
    JarvisInterpreterPhase phase;
    Optional<String> highlightTime;
    Optional<String> topic;
    Optional<String> from;

    public JarvisInterpreter() {
        content = new StringBuilder();
        phase = JarvisInterpreterPhase.CAPABILITY;
    }

    @Override
    public Void visitCapabilityPhrase(@NotNull JarvisParser.CapabilityPhraseContext ctx) {
        phase = JarvisInterpreterPhase.CAPABILITY;

        content.append("create").append(" ").append("Capability").append(" ");
        content.append(ctx.IDENTIFIER()).append(" ");
        content.append("with").append(" ").append("mission").append(" ");
        content.append("'").append(extractMissionDescription(ctx)).append("'");
        content.append("\n");

        return super.visitCapabilityPhrase(ctx);
    }

    @Override
    public Void visitGoalsStartPhrase(@NotNull JarvisParser.GoalsStartPhraseContext ctx) {
        phase = JarvisInterpreterPhase.GOALS;
        return super.visitGoalsStartPhrase(ctx);
    }

    @Override
    public Void visitGoalPhrase(@NotNull JarvisParser.GoalPhraseContext ctx) {
        content.append("add Goal ").append("'").append(extractPhrase(ctx)).append("'").append("\n");
        return super.visitGoalPhrase(ctx);
    }

    @Override
    public Void visitHighlightPhrase(@NotNull JarvisParser.HighlightPhraseContext ctx) {
        phase = JarvisInterpreterPhase.HIGHLIGHTS;
        highlightTime = extractHighlightTime(ctx);
        topic = Optional.empty();
        return super.visitHighlightPhrase(ctx);
    }

    @Override
    public Void visitTopicPhrase(@NotNull JarvisParser.TopicPhraseContext ctx) {
        topic = extractTopic(ctx);
        return super.visitTopicPhrase(ctx);
    }

    @Override
    public Void visitHowToPhrase(@NotNull JarvisParser.HowToPhraseContext ctx) {
        phase = JarvisInterpreterPhase.TASKS;
        return super.visitHowToPhrase(ctx);
    }

    @Override
    public Void visitItemPhrase(@NotNull JarvisParser.ItemPhraseContext ctx) {
        String description = ctx.getText().trim().replaceFirst("-", "").trim();
        if (phase == JarvisInterpreterPhase.HIGHLIGHTS) {
            content.append("register Fact '").append(description).append("'");
            topic.ifPresent(topicDescription -> content.append(" for topic '").append(topicDescription).append("'"));
            content.append(" on time '").append(highlightTime.get()).append("'");
            content.append("\n");
        } else if (phase == JarvisInterpreterPhase.TASKS) {
            content.append("add Action Item '").append(description).append("'\n");
        } else if (phase == JarvisInterpreterPhase.GREAT_FEEDBACK) {
            content.append("receive Great Feedback");
            from.ifPresent(from -> content.append(" from ").append(from));
            content.append(": ").append(description).append("\n");
        } else if (phase == JarvisInterpreterPhase.CONSTRUCTIVE_FEEDBACK) {
            content.append("receive Constructive Feedback");
            from.ifPresent(from -> content.append(" from ").append(from));
            content.append(": ").append(description).append("\n");
        }
        return super.visitItemPhrase(ctx);
    }

    @Override
    public Void visitConstructiveFeedbackPhase(@NotNull JarvisParser.ConstructiveFeedbackPhaseContext ctx) {
        phase = JarvisInterpreterPhase.CONSTRUCTIVE_FEEDBACK;
        from = Optional.empty();
        return super.visitConstructiveFeedbackPhase(ctx);
    }

    @Override
    public Void visitGreatFeedbackPhrase(@NotNull JarvisParser.GreatFeedbackPhraseContext ctx) {
        phase = JarvisInterpreterPhase.GREAT_FEEDBACK;
        from = Optional.empty();
        return super.visitGreatFeedbackPhrase(ctx);
    }

    @Override
    public Void visitFromPhrase(@NotNull JarvisParser.FromPhraseContext ctx) {
        from = Optional.of(ctx.getText().replaceAll(ctx.FROM_DESCRIPTOR().getText(), ""));
        return super.visitFromPhrase(ctx);
    }

    private Optional<String> extractTopic(JarvisParser.TopicPhraseContext ctx) {
        return Optional.of(ctx.getText().replaceAll(ctx.TOPIC_DESCRIPTOR().getText(), "").trim());
    }

    private Optional<String> extractHighlightTime(JarvisParser.HighlightPhraseContext ctx) {
        return Optional.of(ctx.getText().replaceAll(ctx.HIGHLIGH_DESCRIPTOR().getText(), "").replaceAll("is:", "").trim());
    }

    private String extractPhrase(JarvisParser.GoalPhraseContext ctx) {
        String trimmed = ctx.getText().trim();
        String digits = ctx.DIGIT().stream().map((element) -> element.getText())
                .reduce("", (accumulator, element) -> accumulator.concat(element));
        trimmed = trimmed.replaceFirst(digits, "");
        trimmed = trimmed.replaceFirst(".", "");
        return trimmed.trim();
    }

    private String extractMissionDescription(JarvisParser.CapabilityPhraseContext ctx) {
        String wholeText = ctx.missionDescription().getText();
        String identifier = ctx.missionDescription().CONNECTOR().getText();
        return wholeText.replaceAll(identifier, "").trim();
    }
}
