package structural.facade.dto;

public class PaymentItem {
   private User user;
   private Double amount;
   private PaymentStatus status;
   public PaymentItem(User user, Double amount) {
       this.user = user;
       this.amount = amount;
       this.status = PaymentStatus.UNPAID;
   }

    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
       this.status = status;
    }

    public User getUser() {
        return user;
    }
}
