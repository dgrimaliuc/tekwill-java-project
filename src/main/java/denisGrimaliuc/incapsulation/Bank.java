package main.java.denisGrimaliuc.incapsulation;


/**
 * Creează o clasă Bank cu câmpul „balance” și metodele addFunds, withdraw, printBalance:
 * <p>
 * •	addFunds(int amount) ar trebui să adauge la balance suma „amount”
 * •	withdraw(int amount) ar trebui să retragă din balance suma „amount”
 * •	printBalance() ar trebui să afișeze balance-ul curent
 */
public class Bank {
    double balance;

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
