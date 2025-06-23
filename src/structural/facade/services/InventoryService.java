package structural.facade.services;

import structural.facade.dto.InventoryItem;

import java.util.List;
import java.util.Optional;

public class InventoryService {

    List<InventoryItem> items;
    public InventoryService(List<InventoryItem> items) {
        this.items = items;
    }

    public InventoryItem checkout(String inventoryItemName, int quantity){
        System.out.println("Checking out " + inventoryItemName);
        InventoryItem item = getItem(inventoryItemName, quantity);
        return item;
    }
    public void updateItemQuantity(String inventoryItemName, int quantity){
        System.out.println("Updating " + inventoryItemName);
        InventoryItem item = getItem(inventoryItemName, quantity);
        item.setQuantity(item.getQuantity() - quantity);
    }

    private InventoryItem getItem(String inventoryItemName, int quantity) {
        Optional<InventoryItem> inventoryItem = items.parallelStream().filter(item -> item.getName().equalsIgnoreCase(inventoryItemName)).findFirst();
        if(inventoryItem.isEmpty()){
            throw new RuntimeException("Item not found");
        }
        InventoryItem item = inventoryItem.get();
        if(item.getQuantity() < quantity){
            throw new RuntimeException("Item quantity less than requested quantity");
        }
        return item;
    }
}
