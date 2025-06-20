package main.java.liliana_stavita;

public class Bank {

    double balance;
    Bank(){
        this.balance = 0.0;
    }

    void addFunds(int amount) {
        balance += amount;

    }
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

        void printBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

