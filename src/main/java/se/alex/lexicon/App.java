package se.alex.lexicon;

import se.alex.lexicon.data.VendingMachine;
import se.alex.lexicon.data.VendingMachineManager;
import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Chips;
import se.alex.lexicon.model.Drinks;

public class App {
    public static void main(String[] args) {
        Product[] products = createProducts();

        VendingMachine vendingMachine = new VendingMachineManager(products);

        // Initialize with 100
        vendingMachine.addCurrency(100);

        System.out.println("Balance: " + vendingMachine.getBalance());

        displayProducts(vendingMachine);

        // choose a product
        int productId =5;

        try {
            Product purchased = vendingMachine.request(productId);
            System.out.println("Purchased: " + purchased.examine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int change = vendingMachine.endSession();
        System.out.println("Change: " + change);
    }

    private static Product[] createProducts() {
        return new Product[]{
                new Drinks(1, "Coca Cola", 30, 330),
                new Drinks(2, "Fanta", 30, 330),
                new Drinks(3, "Sprite", 30, 330),
                new Candy(4, "Gummy Bears", 25, "Mixed Flavor"),
                new Candy(5, "Bilar", 25, "Caramel Flavor"),
                new Chips(6, "Pringles", 20, "Original"),
                new Chips(7, "Estrella", 20, "Salted")
        };
    }

    private static void displayProducts(VendingMachine vendingMachine) {
        String[] productDescriptions = vendingMachine.getProducts();
        for (String product : productDescriptions) {
            System.out.println(product);
        }
    }
}
