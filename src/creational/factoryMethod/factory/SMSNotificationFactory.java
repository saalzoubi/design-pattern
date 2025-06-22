package creational.factoryMethod.factory;

import creational.factoryMethod.product.Notification;
import creational.factoryMethod.product.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
