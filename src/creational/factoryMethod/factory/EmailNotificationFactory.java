package creational.factoryMethod.factory;

import creational.factoryMethod.product.EmailNotification;
import creational.factoryMethod.product.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
