package structural.facade.services;

import structural.facade.dto.PaymentItem;
import structural.facade.dto.PaymentStatus;
import structural.facade.dto.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentService {
    private List<PaymentItem> paymentItems;

    public PaymentService() {
        paymentItems = new ArrayList<PaymentItem>();
    }

    public void createPayment(User user, double amount) {
        Optional<PaymentItem> paymentItemOptional = paymentItems.parallelStream().filter(p -> p.getUser().equals(user)).findFirst();
        PaymentItem paymentItem;
        paymentItem = paymentItemOptional.orElseGet(() -> {
            PaymentItem paymentItem1 = new PaymentItem(user, amount);
            paymentItems.add(paymentItem1);
            return paymentItem1;
        });
        if (List.of(PaymentStatus.PAID, PaymentStatus.PROCESSING).contains(paymentItem.getStatus())) {
            throw new RuntimeException("Payment is already paid or processing.");
        }
        paymentItem.setStatus(PaymentStatus.PROCESSING);
        System.out.println("Paying " + amount);
        paymentItem.setStatus(PaymentStatus.PAID);

    }



}
