// File: src/main/java/se/model/VendingMachine.java
package model;

import model.Product;

/**
 * Interface representing a Vending Machine.
 * Defines the operations that any vending machine should provide.
 */
public interface VendingMachine {
    void addCurrency(int amount);         // Method to add currency to the vending machine
    Product request(int productId);       // Method to request a product
    int endSession();                     // Method to end the session and return remaining balance
    String getDescription(int productId); // Method to get description of a product
    int getBalance();                     // Method to get current balance
    String[] getProducts();               // Method to get list of products
}
