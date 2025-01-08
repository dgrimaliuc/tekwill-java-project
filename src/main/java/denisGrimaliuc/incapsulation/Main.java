package main.java.denisGrimaliuc.incapsulation;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addFunds(100);
        bank.printBalance();
        bank.withdraw(50);
        bank.printBalance();
    }
}
