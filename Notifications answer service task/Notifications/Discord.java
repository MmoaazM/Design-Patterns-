package Notifications;

import QuestionAsker.User;

public class Discord extends   Notification {

    public Discord() {}
    public Discord(boolean isImportant, String answerText) {
        super(isImportant, answerText);
    }

    @Override
    public void send(User questionAsker) {
        System.out.println("sending Discord");
    }
}
