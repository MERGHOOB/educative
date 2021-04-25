package clazzes.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        return true;
    }

    public  boolean removeItems(Item item) {
        return true;
    }
    public  boolean updateItem(Item item, int quantity) {
        return item.updateQuantiy(quantity);
    }

    public boolean checkout() {
        return true;
    }

}
