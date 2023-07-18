package serghei_condrasov.abstraction;

/*2. Create subclasses of Bank Account, such as "SavingsAccount"
and implement the "deposit" and "withdraw" methods differently in each subclass.*/

public class SavingsAccount extends BankAccount {

    @Override
    public void deposit() {
        System.out.println("Deposit on savings account = " + 5000);
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw on savings account = " + 2000);
    }
}
