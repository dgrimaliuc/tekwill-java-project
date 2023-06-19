package Leas_Liudmila.abstraction;

public class SavingsAccount extends BankAccount {

    private double tax = 0.1;

    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;

    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount + (amount * tax);
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount - (amount * tax);
        return balance;
    }
}
