package io.quarkus.github.lottery.draw;

import io.quarkus.github.lottery.config.LotteryConfig;

/**
 * A participant in the {@link Lottery}.
 */
public final class Participant {
    private final DrawRef drawRef;
    private final String username;

    private final Participation triage;

    public Participant(DrawRef drawRef, LotteryConfig.ParticipantConfig config) {
        this.drawRef = drawRef;
        username = config.username();
        triage = new Participation(config.triage());
    }

    public void participate(Lottery lottery) {
        triage.participate(lottery.triage());
        // TODO add more participations, one per maintained label
    }

    public LotteryReport report() {
        return new LotteryReport(drawRef, username, triage.result());
    }
}
