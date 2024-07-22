package main.java.PotoracMihai.task6_19_07_24;

public class Bank {

    double balance;

    Bank() {
        this.balance = balance;
    }

    void addFunds(double amount) {
        balance += amount;
    }

    void withdrawFunds(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Your balance is: " + balance);
    }
}


