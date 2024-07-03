package se.alex.lexicon;

import java.util.Scanner;
import se.alex.lexicon.model.VendingMachine;

public class App {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new CandyVendingMachine();
        Scanner scanner = new Scanner(System.in);

        displayProducts(vendingMachine);

        while (true) {
            System.out.println("Welcome to the Vending Machine!");
            System.out.println("1. Add Currency");
            System.out.println("2. Request Product");
            System.out.println("3. End Session");
            System.out.println("4. Get Product Description");
            System.out.println("5. Get Balance");
            System.out.println("6. Get Products");
            System.out.println("7. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add (1, 2, 5, 10, 20, 50, 100, 200, 500, 1000): ");
                    int amount = scanner.nextInt();
                    vendingMachine.addCurrency(amount);
                    System.out.println("Current balance: " + vendingMachine.getBalance());
                    break;
                case 2:
                    System.out.print("Enter product ID to request: ");
                    int productId = scanner.nextInt();
                    if (vendingMachine.request(productId) != null) {
                        System.out.println("Product purchased successfully.");
                    }
                    System.out.println("Current balance: " + vendingMachine.getBalance());
                    break;
                case 3:
                    int refund = vendingMachine.endSession();
                    System.out.println("Session ended. Refunded amount: " + refund);
                    break;
                case 4:
                    System.out.print("Enter product ID for description: ");
                    int descId = scanner.nextInt();
                    System.out.println(vendingMachine.getDescription(descId));
                    break;
                case 5:
                    System.out.println("Current balance: " + vendingMachine.getBalance());
                    break;
                case 6:
                    displayProducts(vendingMachine);
                    break;
                case 7:
                    System.out.println("Exiting the vending machine. Have a nice day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void displayProducts(VendingMachine vendingMachine) {
        System.out.println("Available products:");
        String[] products = vendingMachine.getProducts();
        for (String product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}