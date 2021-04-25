package clazzes.users;

import clazzes.Account;
import clazzes.entities.Order;
import clazzes.entities.Product;

public class Member extends Customer {

    private Account account;

    public boolean addProudct(Product product) {
        return true;
    }

    public boolean placeOrder(Order order) {
        return true;
    }


}
