package creational.factoryMethod.approach2.factory;

import creational.factoryMethod.approach2.product.EmailNotification;
import creational.factoryMethod.approach2.product.Notification;
import creational.factoryMethod.approach2.product.PushNotification;
import creational.factoryMethod.approach2.product.SMSNotification;

/**
 * ✅ Benefit
 * </br>
 * ✅ Simpler =>	Fewer classes, less boilerplate</br>
 * ✅ Easy to extend =>	Just add a new case in the switch statement</br>
 * ✅ Centralized logic => 	All creation logic in one place</br>
 * ✅ Safer with Enum => Avoids typo-prone string comparisons</br>
 *
 * ❌ Trade-Offs</br>
 *
 * ❌ Violates Open/Closed Principle =>	You must modify the factory to add a new type</br>
 * ❌ Less flexible than class-per-factory =>	Can't easily plug in behaviors via subclassing</br>
 * */
public class NotificationFactory {

    public Notification createNotification(NotificationType notificationType) {
        return switch (notificationType) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SMSNotification();
            case PUSH -> new PushNotification();
            default -> throw new IllegalArgumentException("Invalid notification type");
        };
    }
}
