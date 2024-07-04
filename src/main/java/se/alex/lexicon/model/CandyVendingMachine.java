package se.alex.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class CandyVendingMachine implements VendingMachine {
    private int depositPool;
    private  List<Product> products;

    public CandyVendingMachine() {
        this.depositPool = 0;
        this.products = new ArrayList<>();
        // Added some products
        products.add(new Candy(1, "Snickers", 15, "Chocolate"));
        products.add(new Chips(2, "Lays", 10, "Classic"));
        products.add(new Drinks(3, "Coca Cola", 12, "500ml"));
    }

    @Override
    public void addCurrency(int amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 ||
                amount == 50 || amount == 100 || amount == 200 || amount == 500 || amount == 1000) {
            depositPool += amount;
        } else {
            throw new IllegalArgumentException("Invalid currency amount.");
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
                    throw new IllegalStateException("Not enough money.");
                }
            }
        }
        throw new IllegalArgumentException("Product not found.");
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product.getDescription();
            }
        }
        throw new IllegalArgumentException("Product not found.");
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] productArray = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productArray[i] = product.getId() + ", " + product.getName() + ", " + product.getPrice();
        }
        return productArray;
    }
}
