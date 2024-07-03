package se.alex.lexicon;

import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Drinks;

import java.util.ArrayList;
import java.util.List;

public class CandyVendingMachine {
    private int balance;
    private List<Product> products;

    public CandyVendingMachine() {
        this.balance = 0;
        this.products = new ArrayList<>();
        products.add(new Candy(1, "Snickers", 10.0, "Chocolate"));
        products.add(new Candy(2, "Haribo", 15.0, "Mixed Fruit"));
        products.add(new Drinks(3, "Coca-Cola", 20.0, 330));
        products.add(new Drinks(4, "Fanta", 18.0, 330));
    }

    public void addCurrency(int amount) {
        int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        boolean isValid = false;
        for (int validAmount : validAmounts) {
            if (amount == validAmount) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount. Please add a valid currency value.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public Product request(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                if (balance >= product.getPrice()) {
                    balance -= product.getPrice();
                    return product;
                } else {
                    System.out.println("Insufficient balance.");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    public int endSession() {
        int refund = balance;
        balance = 0;
        return refund;
    }

    public String getDescription(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product.examine();
            }
        }
        return "Product not found.";
    }

    public String[] getProducts() {
        String[] productDescriptions = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productDescriptions[i] = "ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice();
        }
        return productDescriptions;
    }
}
