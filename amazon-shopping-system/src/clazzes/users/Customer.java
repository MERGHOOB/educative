package clazzes.users;

import clazzes.entities.Item;
import clazzes.entities.Order;
import clazzes.entities.ShoppingCart;

public class Customer {
    private ShoppingCart shoppingCart;
    private Order order;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public boolean addItemToCart(Item item) {
        return true;
    }

    public boolean removeItemFromCart(Item item) {
        return true;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
