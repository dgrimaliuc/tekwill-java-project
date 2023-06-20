package Leas_Liudmila.abstraction;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1200);
        CheckingAccount checkingAccount = new CheckingAccount(5000);

        System.out.println(savingsAccount.deposit(1000));
        System.out.println(savingsAccount.deposit(2000));
        System.out.println(savingsAccount.withdraw(500));

        System.out.println(checkingAccount.deposit(1000));
        System.out.println(checkingAccount.withdraw(500));
   
    }
}