package creational.factoryMethod.product;

/**
 * Create Concrete Product
 * */
public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email Notification Sent");
    }
}
