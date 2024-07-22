package SergheiRubailo.Task9;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void addFunds(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
}
