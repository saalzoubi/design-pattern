package structural.facade.dto;

public class InventoryItem {
   private String name;
   private Double price;
   private Integer quantity;
   public InventoryItem(String name, Double price, Integer quantity) {
       this.name = name;
        this.price = price;
        this.quantity = quantity;
   }
   public String getName() {
       return name;
   }
   public Double getPrice() {
       return price;
   }
   public Integer getQuantity() {
       return quantity;
   }
   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }

    public void setPrice(Double price) {
        this.price = price;
    }
}
