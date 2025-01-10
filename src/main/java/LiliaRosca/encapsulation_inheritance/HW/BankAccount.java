package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 1 - numărul contului, sold și numele titularului contului

public class BankAccount {
    String accNumber;
    Double accBalance;
    String accHolderName;

    BankAccount(String accNumber, Double accBalance, String accHolderName) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.accHolderName = accHolderName;
    }
}
