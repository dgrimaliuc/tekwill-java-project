package main.java.IonErm.HomeWork.OOP.Inheritance;

public class DepositAccount extends BankAccount {
    public double interestRate;
    public double minimumBalance;

    DepositAccount(int accNumber, double sold, String name, double interestRate, double minimumBalance) {
        super(accNumber, sold, name);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }
}
