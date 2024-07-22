package DenisGrimaliuc.task1907.inheritance;

/*


 Implement a class called "BankAccount" with instance variables for account number, balance, and
 account holder name. Create a subclass called "SavingsAccount" that inherits from "BankAccount"
  and includes additional instance variables such as interest rate and minimum balance.
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;
    private double minimumBalance;

    public SavingsAccount(int accountNumber, double balance, String accountHolderName, double interestRate, double minimumBalance) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Minimum balance: " + minimumBalance);
    }

}
