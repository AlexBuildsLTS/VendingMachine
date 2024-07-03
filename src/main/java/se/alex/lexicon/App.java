package se.alex.lexicon;

public class App {
    public static void main(String[] args) {
        VendingMachine machine = new CandyVendingMachine();

        System.out.println("Available products:");
        for (String product : machine.getProducts()) {
            System.out.println(product);
        }

        machine.addCurrency(50);
        System.out.println("Balance: " + machine.getBalance());

        System.out.println("Requesting product 1:");
        System.out.println(machine.request(1).getDescription());

        System.out.println("Balance: " + machine.getBalance());

        System.out.println("Requesting product 3:");
        System.out.println(machine.request(3).getDescription());

        System.out.println("Balance: " + machine.getBalance());

        System.out.println("Ending session, returning money: " + machine.endSession());
        System.out.println("Balance: " + machine.getBalance());
    }
}
