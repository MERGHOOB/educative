package clazzes.entities;

public class Item {
    private String productID;
    private  int quantity;
    private double price;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean updateQuantiy(int quantity) {
        this.quantity = quantity;
        return true;
    }
}
