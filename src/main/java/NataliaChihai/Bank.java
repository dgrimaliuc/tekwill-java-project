package main.java.NataliaChihai;

public class Bank {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Add this to run the code
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(1500.0);
        System.out.println("Balance: " + bank.getBalance());
    }
}
