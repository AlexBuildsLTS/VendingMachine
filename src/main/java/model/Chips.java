package model;


public class Chips extends Product {
    private String type; // Additional attribute specific to Chips

    // Constructor to initialize Chips with its specific attributes
    public Chips(int id, double price, String productName, String type, int quantity) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.type = type;
        setQuantity(quantity);
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementation of the abstract method examine()
    @Override
    public String examine() {
        return "Chips: " + getProductName() + ", Type: " + type + ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }

    // Implementation of the abstract method use()
    @Override
    public String use() {
        return "Enjoy your " + getType() + " chips!";
    }
}
