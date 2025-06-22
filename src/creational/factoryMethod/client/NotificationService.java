package creational.factoryMethod.client;

import creational.factoryMethod.factory.EmailNotificationFactory;
import creational.factoryMethod.factory.NotificationFactory;
import creational.factoryMethod.factory.PushNotificationFactory;
import creational.factoryMethod.factory.SMSNotificationFactory;
import creational.factoryMethod.product.EmailNotification;
import creational.factoryMethod.product.Notification;
import creational.factoryMethod.product.PushNotification;
import creational.factoryMethod.product.SMSNotification;

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
