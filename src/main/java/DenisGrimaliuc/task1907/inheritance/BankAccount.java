package DenisGrimaliuc.task1907.inheritance;

/*


 Implement a class called "BankAccount" with instance variables for account number, balance, and
 account holder name. Create a subclass called "SavingsAccount" that inherits from "BankAccount"
  and includes additional instance variables such as interest rate and minimum balance.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account holder name: " + accountHolderName);
    }

}
