package behavioral.strategy.stratigies;

public class PaybalPaymentStrategy implements PaymentStrategy {
    private String email;
    public PaybalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Paypal Payment for email: "+email);
    }
}
