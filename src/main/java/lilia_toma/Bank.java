package main.java.lilia_toma;

// ------------practica Encapsulation----------
class Bank {
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
/// **
// * Creeaza o clasa numita Bank cu camplul "balance" si metodele addFunds, withdraw, printBalance:
// * addFunds(int amount) ar trebui sa adauge la balance suma "amount"
// * withdraw(int amount) ar trebui sa retraga din balance suma "amount"
// * printBalance() ar trebui sa afiseze balance-ul curent
// */
//public class Bank {
//    double balance;
//
//    Bank() {
//        this.balance = 0.0;
//    }
//
//    void addFunds(int amount) {
//        balance += amount;
//    }
//
//    void withdraw(int amount) {
//        if (amount <= balance) {
//            balance -= amount;
//        } else {
//            System.out.println("Insufficient funds for withdrawal.");
//        }
//    }
//
//    void printBalance() {
//        System.out.println("Current balance: " + balance);
//    }
//}
