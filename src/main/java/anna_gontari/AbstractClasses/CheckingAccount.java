package anna_gontari.AbstractClasses;
//Create an abstract class called "BankAccount" with abstract methods named "deposit" and "withdraw".
// Create two subclasses of BankAccount, such as "SavingsAccount" and "CheckingAccount", and implement
// the "deposit" and "withdraw" methods differently in each subclass.
public class CheckingAccount extends BankAccount {
    private double balance;
    private double amount;

    public CheckingAccount(double balance, double amount){
        this.balance = balance;
        this.amount = amount;
    }
    @Override
    public double deposit() {
        balance += amount;
        return balance ;
    }

    @Override
    public double withdraw() {
        balance += amount;
        return balance ;
    }
}

