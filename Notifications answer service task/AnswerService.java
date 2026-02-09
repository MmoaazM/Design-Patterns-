import Notifications.Notification;
import Notifications.NotificationFactory;
import PortalType.PortalFactory;
import PortalType.PortalType;
import QuestionAsker.User;

import java.util.List;

public class AnswerService {
    private List<Notification>Notifications;
    private PortalType portal;

    public AnswerService(String portalType, List<Notification>Notifications) {
        this.portal = new PortalFactory().createPortalType(portalType);
        this.Notifications = Notifications;
    }

    private boolean ValidAnswer(String answerText){

        if(!portal.validateAnswerText(answerText)) return false;
        return true;
    }

    private void saveAnswer(Notification notification){
        System.out.println("[DB] Answer Saved: " + notification.answerText);
        Notifications.add(notification);
    }

//    private void notifyAsker(User questionAsker,String answerText){
//        notification.send(questionAsker,answerText);
//    }


    public void processAnswer(Notification notification, User author, User questionAsker){

        // 1-Validation
        if(!ValidAnswer(notification.answerText)) return;

        // 2-save
        saveAnswer(notification);
    }
}
