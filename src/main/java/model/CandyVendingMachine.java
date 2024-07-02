
package model;

import java.util.HashMap;
import java.util.Map;


public class CandyVendingMachine implements VendingMachine {
    private int depositPool = 0;           // Holds the current deposited money
    private Map<Integer, Product> products = new HashMap<>(); // Holds the available products

    // Constructor to initialize the vending machine with some products
    public CandyVendingMachine() {
        products.put(1, new Candy(1, 20.0, "Chocolate Bar", "Chocolate", 12));
        products.put(2, new Chips(2, 32.0, "Potato Chips", "Salted", 10));
        products.put(3, new Drinks(3, 30.0, "Cola", "500ml", 5));
    }

    // Method to add currency to the vending machine
    @Override
    public void addCurrency(int amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 ||
                amount == 50 || amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            depositPool += amount;
        } else {
            throw new IllegalArgumentException("Invalid currency amount");
        }
    }

    // Method to request a product
    @Override
    public Product request(int productId) {
        Product product = products.get(productId);
        if (product != null && depositPool >= product.getPrice() && product.getQuantity() > 0) {
            depositPool -= product.getPrice();
            product.setQuantity(product.getQuantity() - 1);
            return product;
        }
        return null;
    }

    // Method to end the session and return the remaining balance
    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }

    // Method to get description of a product
    @Override
    public String getDescription(int productId) {
        Product product = products.get(productId);
        return product != null ? product.examine() : "Product not found";
    }

    // Method to get the current balance
    @Override
    public int getBalance() {
        return depositPool;
    }

    // Method to get a list of products
    @Override
    public String[] getProducts() {
        return products.values().stream()
                .map(product -> product.getId() + ", " + product.getProductName() + ", " + product.getPrice() + ", Quantity: " + product.getQuantity())
                .toArray(String[]::new);
    }
}
