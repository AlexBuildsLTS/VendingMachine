package model;

// App class to test the functionality
public class App {
    public static void main(String[] args) {
        // Initialize the vending machine
        VendingMachine vm = new CandyVendingMachine();

        // Add Currency
        vm.addCurrency(50);
        System.out.println("Balance: " + vm.getBalance());

        // Display available products
        System.out.println("Available Products: ");
        for (String product : vm.getProducts()) {
            System.out.println(product);
        }

        // Request a product
        Product purchasedProduct = vm.request(1);
        if (purchasedProduct != null) {
            System.out.println("Purchased: " + purchasedProduct.use());
        } else {
            System.out.println("Not enough balance or product is out of stock.");
        }

        // Display balance after purchase
        System.out.println("Balance after purchase: " + vm.getBalance());

        // Get description of a product
        System.out.println("Product Description: " + vm.getDescription(2));

        // End the session and return the remaining balance
        System.out.println("Ending session. Returning balance: " + vm.endSession());
        System.out.println("Balance after ending session: " + vm.getBalance());
    }
}
