package alexei_drujinin.AbstractClasses;

public class SavingsAccount extends BankAccount{
    private double balance;
    private double amount;
    private double percentage;


    public SavingsAccount(double balance, double amount, double percentage) {
        this.balance = balance;
        this.amount = amount;
        this.percentage = percentage;
    }

    @Override
    public double deposit() {
        this.balance+= amount + percentage;
        return balance ;
    }
    @Override
    public double withdraw(){
        balance += amount - percentage;
        return balance ;
    }
}
