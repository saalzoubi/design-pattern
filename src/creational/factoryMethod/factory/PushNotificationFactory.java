package creational.factoryMethod.factory;

import creational.factoryMethod.product.Notification;
import creational.factoryMethod.product.PushNotification;

public class PushNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
