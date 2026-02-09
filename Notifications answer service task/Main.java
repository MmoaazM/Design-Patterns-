import Notifications.*;
import QuestionAsker.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();
        User user=new ProUser(true);

///  this for just testing the logic of iterator
//        notifications.add(new Email(true,"this notification is important"));
//        notifications.add(new SMS(true,"this sms is important"));
//        notifications.add(new Email());
//        notifications.add(new Email());

        AnswerService answerService=new AnswerService("Kids",notifications);
        answerService.processAnswer(new Email(true,"this notification is important"),new FreeUser(false),user);
        answerService.processAnswer(new SMS(true,"this notification is important"),new FreeUser(false),user);
        answerService.processAnswer(new Discord(true,"this notification is important"),new FreeUser(false),user);


        NotificationIterator iterator=new NotificationIterator(user,notifications);

        while(iterator.hasNext()){
            iterator.next().send(user);
        }


    }
}
