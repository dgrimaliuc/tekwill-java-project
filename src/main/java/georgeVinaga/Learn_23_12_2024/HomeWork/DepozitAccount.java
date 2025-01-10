package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

/*
Creați o subclasă numită „DepozitAccount” care moștenește
de la „BankAccount” și include variabile de instanță suplimentare, cum ar fi rata dobânzii și soldul minim.
 */

public class DepozitAccount extends BankAccount{
    private double rata;

    private double soldMinim;

    DepozitAccount(int accpuntId, double balance, String accountHolderName, double rata, double soldMinim) {
        super(accpuntId, balance, accountHolderName);
        this.rata = rata;
        this.soldMinim = soldMinim;
    }
    public void print() {
        super.print(); // Adic[ printeaza mai intii printurile din prima clasa BankAccount
        System.out.println("Rata: " + rata);
        System.out.println("Sold Minim: " + soldMinim);
    }
}
