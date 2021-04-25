package clazzes.entities;

import clazzes.Account;

public class Product {

    String proudctID;
    String name;
    String description;
    double price;

    public String getProudctID() {
        return proudctID;
    }

    public void setProudctID(String proudctID) {
        this.proudctID = proudctID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public Account getSeller() {
        return Seller;
    }

    public void setSeller(Account seller) {
        Seller = seller;
    }

    ProductCategory productCategory;
    int availableCount;

    private Account Seller;

    public boolean updatePrice(double price) {
        this.price = price;
        return true;
    }
}
