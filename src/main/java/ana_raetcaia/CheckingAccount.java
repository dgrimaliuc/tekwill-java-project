package ana_raetcaia;

public class CheckingAccount extends BankAccount{
    private double balance;
    private double amount;

    public CheckingAccount(double balance, double amount){
        this.balance = balance;
        this.amount = amount;
    }
    @Override
    public double deposit() {
        balance += amount;
        return balance ;
    }

    @Override
    public double withdraw() {
        balance += amount;
        return balance ;
    }
}
