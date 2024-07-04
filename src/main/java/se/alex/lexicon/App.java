package se.alex.lexicon;

import se.alex.lexicon.data.VendingMachine;
import se.alex.lexicon.data.VendingMachineManager;
import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Chips;
import se.alex.lexicon.model.Drinks;

public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Drinks("Coca Cola", 30, 330),
                new Drinks("Fanta", 30, 330),
                new Drinks("Sprite", 30, 330),
                new Candy("Gummy Bears", 25, "Mixed Flavor"),
                new Candy("Bilar", 25, "Caramel Flavor"),
                new Chips("Pringles", 20, "Original"),
                new Chips("Estrella", 20, "Salted")
        };

        VendingMachine vendingMachine = new VendingMachineManager(products);

        // Displays products
        for (String product : vendingMachine.getProducts()) {
            System.out.println(product);
            System.out.println("-----");
        }

        // Currency
        vendingMachine.addCurrency(50);

        // Product
        Product product = vendingMachine.request(4); // request of the product gummy
        if (product != null) {
            System.out.println(product.use());
        }

        // Display remaining balance
        System.out.println("Remaining balance: " + vendingMachine.getBalance());
    }
}
