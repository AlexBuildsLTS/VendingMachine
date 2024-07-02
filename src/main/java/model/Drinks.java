package model;

public class Drinks extends Product {
    private String size; // Additional attribute specific to Drinks

    // Constructor to initialize Drinks with its specific attributes
    public Drinks(int id, double price, String productName, String size) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.size = size;
    }

    // Getter and Setter for size
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Implementation of the abstract method examine()
    @Override
    public String examine() {
        return "Drink: " + getProductName() + ", Size: " + size + ", Price: " + getPrice();
    }

    // Implementation of the abstract method use()
    @Override
    public String use() {
        return "Enjoy your " + getSize() + " drink!";
    }
}