package Notifications;

import QuestionAsker.User;

public abstract class Notification {
    
    private boolean isImportant;

    public String answerText;

    public Notification() {}
    public Notification(boolean isImportant, String answerText){
        this.isImportant = isImportant;
        this.answerText = answerText;
    }
    
    public abstract void send(User questionAsker);

    public boolean isImportant() {
        return this.isImportant;
    }
}
