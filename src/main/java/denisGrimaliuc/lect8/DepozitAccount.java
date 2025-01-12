package main.java.denisGrimaliuc.lect8;

/**
 * Creați o subclasă numită „DepozitAccount” care moștenește
 * de la „BankAccount” și include variabile de instanță suplimentare, cum ar fi rata dobânzii și soldul minim.
 */
public class DepozitAccount extends BankAccount {
    private double rata;
    private double soldMinim;

    DepozitAccount(int accountId, double balance, String accountHolderName, double rata, double soldMinim) {
        super(accountId, balance, accountHolderName);
        this.rata = rata;
        this.soldMinim = soldMinim;
    }

    public void print() {
        super.print();
        System.out.println("Rata: " + rata);
        System.out.println("Sold Minim: " + soldMinim);
    }
}
