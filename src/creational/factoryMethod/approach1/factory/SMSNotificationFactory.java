package creational.factoryMethod.approach1.factory;

import creational.factoryMethod.approach1.product.Notification;
import creational.factoryMethod.approach1.product.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
