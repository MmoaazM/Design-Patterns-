package Notifications;

public class NotificationFactory {

    public Notification createNotificationChannel(String type) {
        if(type.equals("Discord")) {
            System.out.println("Discord channel created");
            return new Discord();
        }
        else if(type.equals("Email")) {
            System.out.println("email channel created");
            return new Email();
        }
        else if(type.equals("SMS")) {
            System.out.println("SMS channel created");
            return new SMS();
        }
        else{
            System.out.println("Invalid Channel Type");
            return null;
        }
    }
}
