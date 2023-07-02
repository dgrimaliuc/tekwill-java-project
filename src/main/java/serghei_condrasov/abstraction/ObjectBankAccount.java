package serghei_condrasov.abstraction;

public class ObjectBankAccount {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit();
        savingsAccount.withdraw();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit();
        checkingAccount.withdraw();
    }
}
