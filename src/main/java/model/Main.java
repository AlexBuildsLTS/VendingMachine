package main;

import model.CandyVendingMachine;
import model.Product;
import model.VendingMachine;

public class Main {
    public static void main(String[] args) {
        // Initialize the vending machine with predefined products
        VendingMachine vendingMachine = new CandyVendingMachine();

        // Add currency to the vending machine
        vendingMachine.addCurrency(50);
        System.out.println("Balance: " + vendingMachine.getBalance());

        // Request a product by ID
        Product product = vendingMachine.request(1);
        if (product != null) {
            System.out.println(product.use());
        } else {
            System.out.println("Product could not be dispensed.");
        }

        // Check balance after purchase
        System.out.println("Balance after purchase: " + vendingMachine.getBalance());

        // End session and return the remaining balance
        System.out.println("Ending session. Change: " + vendingMachine.endSession());
    }
}
