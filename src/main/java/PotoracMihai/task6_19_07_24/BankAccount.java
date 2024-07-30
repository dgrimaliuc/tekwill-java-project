package main.java.PotoracMihai.task6_19_07_24;

public class BankAccount {
    private int Id;

    private int balance;

    private String holdername;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

        if (balance < 0) {
            System.out.println("Balance cannot be negative");
        } else {
            this.balance = balance;
        }
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }
}
