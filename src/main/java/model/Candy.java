
package model;

public class Candy extends Product {
    private String flavor; // Additional attribute specific to Candy

    // Constructor to initialize Candy with its specific attributes
    public Candy(int id, double price, String productName, String flavor) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.flavor = flavor;
    }

    // Getter and Setter for flavor
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Implementation of the abstract method examine()
    @Override
    public String examine() {
        return "Candy: " + getProductName() + ", Flavor: " + flavor + ", Price: " + getPrice();
    }

    // Implementation of the abstract method use()
    @Override
    public String use() {
        return "Enjoy your " + getFlavor() + " candy!";
    }
}
