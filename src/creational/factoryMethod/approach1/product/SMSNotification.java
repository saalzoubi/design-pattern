package creational.factoryMethod.approach1.product;

/**
 * Create Concrete Product
 * */
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Sent");
    }
}
