package se.alex.lexicon;

import se.alex.lexicon.data.VendingMachine;
import se.alex.lexicon.data.VendingMachineManager;
import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Chips;
import se.alex.lexicon.model.Drinks;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Product[] products = createProducts();

        VendingMachine vendingMachine = new VendingMachineManager(products);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display balance and products
            System.out.println("Current balance: " + vendingMachine.getBalance());
            displayProducts(vendingMachine);

            // Ask the user to add funds or purchase a product
            System.out.println("Enter 'a' to add funds, 'p' to purchase a product, or 'q' to quit: ");
            String action = scanner.next();

            if (action.equalsIgnoreCase("q")) {
                break;
            } else if (action.equalsIgnoreCase("a")) {
                System.out.println("Enter the amount to add (valid denominations: 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000): ");
                int amount = scanner.nextInt();
                try {
                    vendingMachine.addCurrency(amount);
                    System.out.println("Added " + amount + " to balance.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (action.equalsIgnoreCase("p")) {
                System.out.println("Enter the ID of the product you want to purchase: ");
                int productId = scanner.nextInt();
                try {
                    Product purchased = vendingMachine.request(productId);
                    System.out.println("Purchased: " + purchased.examine());
                    System.out.println(purchased.use());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        // End session and return change
        int change = vendingMachine.endSession();
        System.out.println("Change returned: " + change);

        scanner.close();
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
