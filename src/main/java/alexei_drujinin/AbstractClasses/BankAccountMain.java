package alexei_drujinin.AbstractClasses;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account1 = new CheckingAccount(10182.50, 4634.32);
        System.out.println("Checking account. Your deposit: " + account1.deposit());
        System.out.println("Checking account. Your withdraw: " + account1.withdraw());

        BankAccount account2 = new SavingsAccount(8465.56,1458.25,4.02);
        System.out.println("Savings account. Your deposit: " + account2.deposit());
        System.out.println("Savings account. Your withdraw: " + account2.withdraw());
    }
}
