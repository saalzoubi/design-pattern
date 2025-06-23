package behavioral.strategy;

import behavioral.strategy.context.PaymentService;
import behavioral.strategy.stratigies.ApplePaymentStrategy;
import behavioral.strategy.stratigies.CreditCardPaymentStrategy;
import behavioral.strategy.stratigies.PaybalPaymentStrategy;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        System.out.println("==========================");
        paymentService.setPaymentStrategy(new ApplePaymentStrategy("d123"));
        paymentService.pay(1500);
        System.out.println("==========================");
        paymentService.setPaymentStrategy(new CreditCardPaymentStrategy("c4455-8765"));
        paymentService.pay(200);
        System.out.println("==========================");
        paymentService.setPaymentStrategy(new PaybalPaymentStrategy("example@sawaedelm.com"));
        paymentService.pay(655);

    }
}
