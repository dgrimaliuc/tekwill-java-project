package main.java.LiliaRosca.encapsulation_inheritance;

public class Bank {
    // exercitii clasa
    Double balance = 1000.00;

    public void addFunds(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
}