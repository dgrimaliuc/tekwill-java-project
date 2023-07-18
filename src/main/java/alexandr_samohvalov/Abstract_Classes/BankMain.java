package alexandr_samohvalov.Abstract_Classes;

public class BankMain {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);
        BankAccount checkingAccount = new CheckingAccount(2000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(1000);
        checkingAccount.withdraw(2500);
        System.out.println("Checking Account balance: " + checkingAccount.getBalance());
    }
}
