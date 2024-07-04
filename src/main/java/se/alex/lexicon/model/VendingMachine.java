package se.alex.lexicon.model;

public interface VendingMachine {
    void addCurrency(int amount);
    Product request(int productId);
    int endSession();
    String getDescription(int productId);
    int getBalance();
    String[] getProducts();
}
