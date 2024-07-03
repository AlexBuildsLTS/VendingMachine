package se.alex.lexicon;

import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.Candy;
import se.alex.lexicon.model.Chips;
import se.alex.lexicon.model.Drinks;

import java.util.ArrayList;
import java.util.List;

public class CandyVendingMachine implements VendingMachine {
    private int depositPool = 0;
    private List<Product> products;

    public CandyVendingMachine() {
        products = new ArrayList<>();
        products.add(new Candy(1, "Snickers", 10, "Chocolate"));
        products.add(new Chips(2, "Lays", 15, "Salted"));
        products.add(new Chips(3, "Pringles", 20, "Sour Cream"));
        products.add(new Drinks(4, "Coke", 20, 330));
        products.add(new Drinks(5, "Sprite", 18, 330));
    }

    @Override
    public void addCurrency(int amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 || amount == 50 ||
                amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            depositPool += amount;
        } else {
            throw new IllegalArgumentException("Invalid currency amount");
        }
    }

    @Override
    public Product request(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    return product;
                } else {
                    throw new IllegalArgumentException("Insufficient funds");
                }
            }
        }
        throw new IllegalArgumentException("Product not found");
    }

    @Override
    public int endSession() {
        int moneyToReturn = depositPool;
        depositPool = 0;
        return moneyToReturn;
    }

    @Override
    public String getDescription(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product.getDescription();
            }
        }
        return "Product not found";
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productDescriptions[i] = product.getId() + ": " + product.getName() + " - " + product.getPrice() + " SEK";
        }
        return productDescriptions;
    }
}
