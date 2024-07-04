package se.alex.lexicon.data;

import se.alex.lexicon.model.Product;

public interface VendingMachine {
    void addCurrency(int amount);
    Product request(int id);
    int endSession();
    String getDescription(int id);
    int getBalance();
    String[] getProducts();
}
