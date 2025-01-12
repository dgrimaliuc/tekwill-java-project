package main.java.denisGrimaliuc.lect8;


/**
 * Implementați o clasă numită „BankAccount” cu variabile de instanță pentru numărul contului,
 * sold și numele titularului contului.
 */
public class BankAccount {
    private int accountId;
    private double balance;
    private String accountHolderName;

    BankAccount() {
        this(0, 0, "");
    }

    BankAccount(int accountId, double balance, String accountHolderName) {
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
