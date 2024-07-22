package ChirilBortnicov.Lesson1907;

public class BankAccount {
    /*Design a class called "BankAccount" with private instance variables for account number(id),
    balance, and account holder name. Implement getter and setter methods for each variable.
    Setter should verify value before setting. */
    private int id;
    private double balance;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
