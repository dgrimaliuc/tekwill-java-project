package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 1 moștenește de la „BankAccount” + rata dobânzii și soldul minim

public class DepozitAccount extends BankAccount {
    Double interestRate;
    Double minimAccBalance;

    DepozitAccount(String accNumber, Double accBalance, String accHolderName, Double interestRate, Double minimAccBalance) {
        super(accNumber, accBalance, accHolderName);
        this.interestRate = interestRate;
        this.minimAccBalance = minimAccBalance;
    }

    @Override
    public String toString() {
        return "DepozitAccount{" +
                "Account Number = '" + accNumber + '\'' +
                ", Account Holder = '" + accHolderName + '\'' +
                ", Account Balance = " + accBalance +
                ", Interest Rate = " + interestRate +
                ", Minimum Balance = " + minimAccBalance + '}';
    }
}
