package main.java.nicolae_luchian;

public class Bank {
    private double balance;

    public void addFunds(double amount) {
        balance += amount;
    }

    public void withdrawFunds(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
                System.out.println("insuficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
