import Notifications.Notification;
import QuestionAsker.User;

import java.util.Iterator;
import java.util.List;

public class NotificationIterator implements Iterator<Notification> {

    private int index=0;
    User user;
    List<Notification>Notifications;

    public NotificationIterator(User user,List<Notification>Notifications) {
        this.user = user;
        this.Notifications=Notifications;
    }

    @Override
    public boolean hasNext() {
        while(index<Notifications.size()){
            if(!Notifications.get(index).isImportant() && user.inDDMode){
                index++;
                continue;
            }
            return true;
        }
        return false;
    }

    @Override
    public Notification next() {
        return Notifications.get(index++);
    }
}
