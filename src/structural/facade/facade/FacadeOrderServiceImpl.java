package structural.facade.facade;

import structural.facade.dto.InventoryItem;
import structural.facade.dto.User;
import structural.facade.services.*;

import java.util.List;
import java.util.Optional;

public class FacadeOrderServiceImpl implements FacadeOrderService {
    InventoryService inventoryService;
    PaymentService paymentService;
    NotificationService notificationService;
    List<User> users;

    public FacadeOrderServiceImpl(InventoryService inventoryService, PaymentService paymentService, NotificationService notificationService, List<User> users) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.users = users;
    }

    @Override
    public void createOrder(String userPhoneNumber, String inventoryItemName, int quantity) {
        Optional<User> optionalUser = users.parallelStream().filter(u -> u.getPhoneNumber().equals(userPhoneNumber)).findFirst();
        if(optionalUser.isEmpty()){
            throw new RuntimeException("User not found");
        }
        User user = optionalUser.get();
        InventoryItem checkout = inventoryService.checkout(inventoryItemName, quantity);
        double totalPrice = checkout.getPrice() * quantity;
        paymentService.createPayment(user,totalPrice);
        inventoryService.updateItemQuantity(inventoryItemName, quantity);
        notificationService.sendNotification(user);

    }
}
