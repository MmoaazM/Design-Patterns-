package Notifications;

import QuestionAsker.User;

public class Slack extends Notification {
    public Slack() {}
    public Slack(boolean isImportant, String answerText) {
        super(isImportant, answerText);
    }

    @Override
    public void send(User questionAsker) {
        System.out.println("Sending Slack");
    }
}
