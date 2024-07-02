package model;

// Class representing a Candy product
public class Candy extends Product {
    private String type; // Type of candy (e.g., Chocolate, Gummy)

    // Constructor to initialize the candy product
    public Candy(int id, double price, String productName, String type, int quantity) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        setQuantity(quantity);
        this.type = type;
    }

    // Implementation of the abstract examine method
    @Override
    public String examine() {
        return "Candy: " + getProductName() + " (" + type + "), Price: " + getPrice() + ", Quantity: " + getQuantity();
    }

    // Implementation of the abstract use method
    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}
