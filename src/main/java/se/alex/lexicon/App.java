package se.alex.lexicon;
import se.alex.lexicon.model.Product;
import se.alex.lexicon.model.CandyVendingMachine;

public class App {
    public static void main(String[] args) {
        CandyVendingMachine machine = new CandyVendingMachine();

        machine.addCurrency(100);
        System.out.println("Balance: " + machine.getBalance());

        String[] products = machine.getProducts();
        for (String product : products) {
            System.out.println(product);
        }

        Product purchased = machine.request(1);
        System.out.println("Purchased: " + purchased.getDescription());

        int change = machine.endSession();
        System.out.println("Change: " + change);
    }
}
