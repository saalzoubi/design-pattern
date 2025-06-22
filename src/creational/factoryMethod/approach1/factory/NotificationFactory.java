package creational.factoryMethod.approach1.factory;

import creational.factoryMethod.approach1.product.Notification;

/**
 * ✅ Benefits:</br>
 * 1. Encapsulates object creation</br>
 * 2. Adheres to SOLID principles</br>
 * 3. Adds flexibility in object instantiation</br>
 * 4. Makes code easier to test and extend</br>
 * 5. Promotes polymorphism</br>
 *
 * ❌ Drawbacks:</br>
 * 1. Increases the number of classes (one per concrete product and factory)</br>
 * 2. Adds a layer of abstraction that may be unnecessary for simple scenarios</br>
 * */
public interface NotificationFactory {

    Notification createNotification();
}
