package SergheiRubailo.Task9;

/*Design a class called "BankAccount" with private instance variables for account number(id), balance, and account holder name.
Implement getter and setter methods for each variable. Setter should verify value before setting.*/

public class BankAccount {
    private int id;
    private double balance;
    private String accountHolderName;

    public BankAccount(int id, double balance, String accountHolderName) {
        this.id = id;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("ID should be > 0!");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance should be > 0!");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.length() > 0) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Account Holder Name should be > 0!");
        }
    }


}
