package creational.factoryMethod.approach1.product;

/**
 * Create Concrete Product
 * */
public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push Notification Sent");
    }
}
