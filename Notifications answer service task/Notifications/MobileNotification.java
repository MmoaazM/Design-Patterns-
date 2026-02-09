package Notifications;

import QuestionAsker.User;

public class MobileNotification extends Notification {

    public MobileNotification(){}
    public MobileNotification(boolean isImportant, String answerText) {
        super(isImportant, answerText);
    }

    @Override
    public void send(User questionAsker) {
        System.out.println("Sending Mobile Notification");
    }
}
