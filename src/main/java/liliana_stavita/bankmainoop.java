package main.java.liliana_stavita;

public class bankmainoop {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addFunds(1230);
        bank.printBalance();

        bank.addFunds(5000);
        bank.printBalance();

        bank.withdraw(250);
        bank.printBalance();

    }
}