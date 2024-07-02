
package model;


public abstract class Product {
    private int id;            // Unique identifier for the product
    private double price;      // Price of the product
    private String productName;// Name of the product

    // Getters and Setters for id, price, and productName
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Abstract methods to be implemented by subclasses
    public abstract String examine();
    public abstract String use();
}
