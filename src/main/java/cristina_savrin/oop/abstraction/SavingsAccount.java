package cristina_savrin.oop.abstraction;

public class SavingsAccount extends BankAccount {

    private double balance;

    public SavingsAccount(double balance) {
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
        return balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        return balance -= amount;
    }
}
