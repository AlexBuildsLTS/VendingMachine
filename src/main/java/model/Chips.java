package model;

// Class representing a Chips product
public class Chips extends Product {
    private String flavor; // Flavor of the chips (e.g., Salted, BBQ)

    // Constructor to initialize the chips product
    public Chips(int id, double price, String productName, String flavor, int quantity) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        setQuantity(quantity);
        this.flavor = flavor;
    }

    // Implementation of the abstract examine method
    @Override
    public String examine() {
        return "Chips: " + getProductName() + " (" + flavor + "), Price: " + getPrice() + ", Quantity: " + getQuantity();
    }

    // Implementation of the abstract use method
    @Override
    public String use() {
        return "Enjoy your " + getProductName() + "!";
    }
}
