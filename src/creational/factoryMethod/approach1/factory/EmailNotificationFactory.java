package creational.factoryMethod.approach1.factory;

import creational.factoryMethod.approach1.product.EmailNotification;
import creational.factoryMethod.approach1.product.Notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
