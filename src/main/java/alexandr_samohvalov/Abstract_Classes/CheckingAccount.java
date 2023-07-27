package alexandr_samohvalov.Abstract_Classes;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = balance - amount;
        if (availableBalance >= 0) {
            balance = availableBalance;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
