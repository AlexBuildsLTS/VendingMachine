package model;

// Interface defining the operations of a vending machine
public interface VendingMachine {
    void addCurrency(int amount);         // Method to add currency to the vending machine
    Product request(int productId);       // Method to request a product and return the product
    int endSession();                     // Method to end the session and return the remaining balance
    String getDescription(int productId); // Method to get description of a product
    int getBalance();                     // Method to get current balance
    String[] getProducts();               // Method to get list of products
}
