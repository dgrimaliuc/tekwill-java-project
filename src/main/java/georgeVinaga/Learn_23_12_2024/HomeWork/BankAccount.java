package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;


/*
Implementați o clasă numită „BankAccount” cu variabile de instanță pentru numărul contului,
sold și numele titularului contului.
*/

public class BankAccount {

    private int accountId;

    private double balance;

    private String accountHolderName;

    BankAccount() {
        accountId = 0;
        balance = 0;
        accountHolderName = "";
    }

    BankAccount(int accountId,double balance, String accountHolderName) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    public void print() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder Name: " + accountHolderName);
    }
}
