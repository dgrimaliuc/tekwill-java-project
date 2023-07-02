package Leas_Liudmila.abstraction;

// Create an abstract class called "BankAccount" with abstract methods named "deposit" and "withdraw".
// Create two subclasses of BankAccount, such as "SavingsAccount" and "CheckingAccount", and implement the "deposit" and "withdraw" methods differently in each subclass.
public abstract class BankAccount {

    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);

}
