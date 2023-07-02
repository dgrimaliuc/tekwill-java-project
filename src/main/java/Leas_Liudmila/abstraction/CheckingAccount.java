package Leas_Liudmila.abstraction;

public class CheckingAccount extends BankAccount {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;

    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }
}