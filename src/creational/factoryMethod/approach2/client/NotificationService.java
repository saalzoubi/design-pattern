package creational.factoryMethod.approach2.client;

import creational.factoryMethod.approach2.factory.NotificationFactory;
import creational.factoryMethod.approach2.factory.NotificationType;
import creational.factoryMethod.approach2.product.Notification;

public class NotificationService {


    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(NotificationType.EMAIL);
        notification.notifyUser();

        notification = notificationFactory.createNotification(NotificationType.SMS);
        notification.notifyUser();

        notification = notificationFactory.createNotification(NotificationType.PUSH);
        notification.notifyUser();


    }

}
