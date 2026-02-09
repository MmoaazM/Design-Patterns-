package QuestionAsker;

public abstract class User {

   public boolean inDDMode;// <-- DDMode represents don't disturb mode

    public User(boolean DD){
        this.inDDMode=DD;
    }
}
