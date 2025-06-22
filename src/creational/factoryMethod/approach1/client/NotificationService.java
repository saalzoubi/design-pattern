package creational.factoryMethod.approach1.client;

import creational.factoryMethod.approach1.factory.EmailNotificationFactory;
import creational.factoryMethod.approach1.factory.NotificationFactory;
import creational.factoryMethod.approach1.factory.PushNotificationFactory;
import creational.factoryMethod.approach1.factory.SMSNotificationFactory;
import creational.factoryMethod.approach1.product.Notification;

public class NotificationService {
    private NotificationFactory notificationFactory;
    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification() {
        Notification notification = notificationFactory.createNotification();
        notification.notifyUser();
    }

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService(new EmailNotificationFactory());
        notificationService.sendNotification();
        
        notificationService = new NotificationService(new SMSNotificationFactory());
        notificationService.sendNotification();

        notificationService = new NotificationService(new PushNotificationFactory());
        notificationService.sendNotification();
    }

}
