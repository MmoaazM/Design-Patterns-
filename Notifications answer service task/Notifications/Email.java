package Notifications;

import EmailFromats.*;
import QuestionAsker.*;

public class Email extends Notification {

    private FormattingEmail formats;

    public Email(){}

    public Email(boolean isImportant, String answerText) {
        super(isImportant, answerText);
    }

    @Override
    public void send(User questionAsker) {
        // the Email is the only one that has the feature of pro & standard user
        formats= new FormatFactory().create(questionAsker);
        formats.fromatMessage(answerText);

        System.out.println("Sending Email");
    }
}
