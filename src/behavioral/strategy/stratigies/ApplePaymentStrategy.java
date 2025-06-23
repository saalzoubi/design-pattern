package behavioral.strategy.stratigies;

public class ApplePaymentStrategy implements PaymentStrategy {
    private String deviceId;
    public ApplePaymentStrategy(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Apple Payment for device: "+deviceId);
    }
}
