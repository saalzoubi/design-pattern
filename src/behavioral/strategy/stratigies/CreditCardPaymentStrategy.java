package behavioral.strategy.stratigies;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment for card Number: "+cardNumber);
    }
}
