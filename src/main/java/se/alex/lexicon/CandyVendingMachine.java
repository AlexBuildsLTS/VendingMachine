package se.alex.lexicon;

import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Chips;
import se.alex.lexicon.model.Drinks;
import se.alex.lexicon.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class CandyVendingMachine implements VendingMachine {
    private int balance;
    private List<Product> products;

    public CandyVendingMachine() {
        this.balance = 0;
        this.products = new ArrayList<>();
        products.add(new Candy(1, "Snickers", 10.0, "Chocolate"));
        products.add(new Chips(2, "Lays", 15.0, "Salted"));
        products.add(new Chips(3, "Pringles", 20.0, "Sour Cream"));
        products.add(new Candy(4, "Gummy Bears", 25.0, "Mixed Fruit"));
        products.add(new Candy(5, "Lollipop", 18.0, "Strawberry"));
        products.add(new Drinks(6, "Sprite", 15.0, 330));
        products.add(new Drinks(7, "Coca-Cola", 15.0, 330));
        products.add(new Drinks(8, "Fanta", 15.0, 330));
    }

    @Override
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

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
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

    @Override
    public int endSession() {
        int refund = balance;
        balance = 0;
        return refund;
    }

    @Override
    public String getDescription(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product.getDescription();
            }
        }
        return "Product not found.";
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productDescriptions[i] = "ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice();
        }
        return productDescriptions;
    }
}
