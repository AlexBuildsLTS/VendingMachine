package model;

public class User {
    private double balance; // User's balance

    // Constructor to initialize the user with a certain balance
    public User(double balance) {
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to add money to the user's balance
    public void addMoney(double amount) {
        balance += amount;
    }

    // Method to spend money from the user's balance
    public boolean spendMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}