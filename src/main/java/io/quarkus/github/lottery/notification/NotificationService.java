package io.quarkus.github.lottery.notification;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.github.lottery.draw.LotteryReport;
import io.quarkus.github.lottery.github.GitHubRepository;

@ApplicationScoped
public class NotificationService {

    public void notify(GitHubRepository repo, String username, LotteryReport lotteryReport) {
        // TODO send an email? A message on an issue? Something else?
    }

}
