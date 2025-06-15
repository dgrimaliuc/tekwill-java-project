package main.java.denis_grimaliuc;


/**
 * Creează o clasă Bank cu câmpul „balance” și metodele addFunds, withdraw, printBalance:
 * <p>
 * •	addFunds(int amount) ar trebui să adauge la balance suma „amount”
 * •	withdraw(int amount) ar trebui să retragă din balance suma „amount”
 * •	printBalance() ar trebui să afișeze balance-ul curent
 */
public class Bank {
    double balance;

    Bank() {
        this.balance = 0.0;
    }

    void addFunds(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
