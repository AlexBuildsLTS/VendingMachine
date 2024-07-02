
package model;


public class Candy extends Product {
    private String flavor; // Additional attribute specific to Candy

    // Constructor to initialize Candy with its specific attributes
    public Candy(int id, double price, String productName, String flavor, int quantity) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.flavor = flavor;
        setQuantity(quantity);
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }

    // Implementation of the abstract method examine()
    @Override
    public String examine() {
        return "Candy: " + getProductName() + ", Flavor: " + flavor + ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }

    // Implementation of the abstract method use()
    @Override
    public String use() {
        return "Enjoy your " + getFlavor() + " candy!";
    }
}
