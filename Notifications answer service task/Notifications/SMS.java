package Notifications;

import QuestionAsker.User;

public class SMS extends   Notification {

    public SMS() {}

    public SMS(boolean isImportant, String answerText) {
        super(isImportant, answerText);
    }

    @Override
    public void send(User questionAsker) {
        System.out.println("Sending SMS");
    }
}
