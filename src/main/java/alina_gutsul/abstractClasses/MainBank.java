package alina_gutsul.abstractClasses;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = balance - amount;
        if (availableBalance >= 0) {
            balance = availableBalance;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class MainBank {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);
        BankAccount checkingAccount = new CheckingAccount(2000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(1000);
        checkingAccount.withdraw(2500);
        System.out.println("Checking Account balance: " + checkingAccount.getBalance());
    }
}

