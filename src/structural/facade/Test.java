package structural.facade;

import structural.facade.dto.InventoryItem;
import structural.facade.dto.User;
import structural.facade.facade.FacadeOrderService;
import structural.facade.facade.FacadeOrderServiceImpl;
import structural.facade.services.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("s1", "12345");
        User user2 = new User("s2", "12346");
        User user3 = new User("s3", "12347");
        InventoryItem item1= new InventoryItem("Iphone 14 pro max",4900.0, 15);
        InventoryItem item2= new InventoryItem("Iphone 16 pro",3750.0, 4);
        InventoryItem item3= new InventoryItem("Samsung S24",2500.0, 100);

        List<InventoryItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        InventoryService inventoryService = new InventoryService(items);
        NotificationService notificationService = new NotificationService(users);
        PaymentService paymentService = new PaymentService();

        FacadeOrderService orderService = new FacadeOrderServiceImpl(inventoryService,paymentService,notificationService, users);
        orderService.createOrder(user1.getPhoneNumber(), item1.getName(), 12);
        System.out.println("===============");
        orderService.createOrder(user2.getPhoneNumber(), item2.getName(), 2);
        System.out.println("===============");
        orderService.createOrder(user3.getPhoneNumber(), item3.getName(), 1);
        System.out.println("===============");
    }
}
