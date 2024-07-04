package se.alex.lexicon.data;

import se.alex.lexicon.model.Product;

public interface VendingMachine {
    void addCurrency(int amount);
    Product request(int productId);
    int endSession();
    String getDescription(int productId);
    int getBalance();
    String[] getProducts();
}
