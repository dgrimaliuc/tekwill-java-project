package DenisGrimaliuc.task1907;

/*
  Create a Bank class with field “balance” and methods addFunds, withdraw, printBalance
      addFunds(int amount) should add to balance amount
      withdraw(int amount) should withdraw from balance amount
      printBalance() should print current balance

    Bank bank = new Bank(1000);

        bank.printBalance();
        bank.addFunds(100);
        bank.printBalance();
        bank.withdraw(200);
        bank.printBalance();
   */
public class Bank {

    double balance;


    Bank(double balance) {
        this.balance = balance;
    }

    void addFunds(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount; // balance = balance - amount;
    }

    void printBalance() {
        System.out.println("Current balance: " + balance);
    }


}
