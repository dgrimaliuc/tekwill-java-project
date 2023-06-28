package anna_gontari.AbstractClasses;

public class TestingBankAccounts {

    public static void main (String[]args){
        BankAccount accountObj = new CheckingAccount(10182.50, 4634.32);
        System.out.println("Checking account. Your deposit: " + accountObj.deposit());
        System.out.println("Checking account. Your withdraw: " + accountObj.withdraw());

        BankAccount accountObj1 = new SavingsAccount(8465.56,1458.25,4.02);
        System.out.println("Savings account. Your deposit: " + accountObj1.deposit());
        System.out.println("Savings account. Your withdraw: " + accountObj1.withdraw());
    }
}
