package anna_gontari.AbstractClasses;
//Create an abstract class called "BankAccount" with abstract methods named "deposit" and "withdraw".
// Create two subclasses of BankAccount, such as "SavingsAccount" and "CheckingAccount", and implement
// the "deposit" and "withdraw" methods differently in each subclass.
public class SavingsAccount extends BankAccount{
    private double balance;
    private double amount;
    private double percentage;
    public SavingsAccount(double balance, double amount, double percentage){
        this.balance = balance;
        this.amount = amount;
        this.percentage = percentage;
    }

    public double deposit() {
        balance += amount + percentage;
        return balance ;
    }

    public double withdraw() {
        balance += amount - percentage;
        return balance ;
    }
}
