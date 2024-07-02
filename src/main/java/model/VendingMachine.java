package model;

import model.Product;

public interface VendingMachine {
    void addCurrency(int amount);         // Method to add currency to the vending machine
    Product request(int productId);       // Method to request a production and return remaining balance
    int endSession();                     // Method to end the se
    String getDescription(int productId); // Method to get description of a product
    int getBalance();                     // Method to get current balance
    String[] getProducts();               // Method to get list of products
}
