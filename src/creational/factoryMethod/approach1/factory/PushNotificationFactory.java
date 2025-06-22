package creational.factoryMethod.approach1.factory;

import creational.factoryMethod.approach1.product.Notification;
import creational.factoryMethod.approach1.product.PushNotification;

public class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
