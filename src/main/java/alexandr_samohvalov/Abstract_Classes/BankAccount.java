package alexandr_samohvalov.Abstract_Classes;
//Create an abstract class called "BankAccount" with abstract methods named "deposit" and "withdraw".
// Create two subclasses of BankAccount, such as "SavingsAccount" and "CheckingAccount", and implement the "deposit" and "withdraw" methods differently in each subclass.
public abstract class BankAccount {
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
