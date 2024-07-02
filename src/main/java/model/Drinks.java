package model;

// Class representing a Drink product
public class Drinks extends Product {
    private String size; // Size of the drink (e.g., 500ml, 1L)

    // Constructor to initialize the drink product
    public Drinks(int id, double price, String productName, String size, int quantity) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        setQuantity(quantity);
        this.size = size;
    }

    // Implementation of the abstract examine method
    @Override
    public String examine() {
        return "Drink: " + getProductName() + " (" + size + "), Price: " + getPrice() + ", Quantity: " + getQuantity();
    }

    // Implementation of the abstract use method
    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}
