package AnastasiaGoncear.Lesson6AnastasiaGoncear;

public class BankAccount {
    private int accountID;
    private double balance;
    private String nameHolder;


    public BankAccount(int accountID, double balance, String nameHolder) {
        this.accountID = accountID;
        this.balance = balance;
        this.nameHolder = nameHolder;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }
}
