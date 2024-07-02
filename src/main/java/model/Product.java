package model;

// Abstract class representing a generic product in the vending machine
public abstract class Product {
    private int id;            // Unique identifier for the product
    private double price;      // Price of the product
    private String productName;// Name of the product
    private int quantity;      // Quantity of the product

    // Getters and Setters for id, price, productName, and quantity
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract methods to be implemented by subclasses
    public abstract String examine();
    public abstract String use();
}
