package serghei_condrasov.abstraction;

/*2. Create subclasses of Bank Account, such as "CheckingAccount"
and implement the "deposit" and "withdraw" methods differently in each subclass.*/

public class CheckingAccount extends BankAccount{
    @Override
    public void deposit() {
        System.out.println("Deposit on checking account = " + 7000);
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw on checking account = " + 3000);
    }
}
