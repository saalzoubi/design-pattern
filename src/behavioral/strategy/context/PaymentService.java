package behavioral.strategy.context;

import behavioral.strategy.stratigies.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment Strategy is null");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
