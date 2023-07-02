package cristina_savrin.oop.abstraction;

public class CheckingAccount extends BankAccount {

    private double balance;
    private final double TAX = 1.15;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double deposit(double amount) {
        return balance = balance + amount * TAX;
    }

    @Override
    public double withdraw(double amount) {
        return balance = balance - amount * TAX;
    }
}
