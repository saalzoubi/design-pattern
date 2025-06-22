package creational.factoryMethod.approach2.product;

/**
 * Create Concrete Product
 * */
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification Sent");
    }
}
