package io.quarkus.github.lottery.config;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public record LotteryConfig(
        @JsonProperty(required = true) LabelsConfig labels,
        List<ParticipantConfig> participants) {

    public record LabelsConfig(
            @JsonProperty(required = true) String needsTriage) {
    }

    public record ParticipantConfig(
            @JsonProperty(required = true) String username,
            @JsonProperty(required = true) @JsonDeserialize(as = TreeSet.class) Set<DayOfWeek> when,
            ParticipationConfig triage) {

    }

    public record ParticipationConfig(
            @JsonProperty(required = true) int maxIssues) {
    }

}
