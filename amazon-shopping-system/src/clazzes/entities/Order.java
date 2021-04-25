package clazzes.entities;

import enums.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {
    String orderNumber;
    OrderStatus orderStatus;
    Date orderDate;
    private List<OrderLog> orderLogs;

    public  boolean sendForShipment() {
        return true;
    }
    public boolean makePayment(Payment payment) {
        return  true;
    }

    public boolean addOrderLog(OrderLog orderLog) {
        return  true;
    }

}
