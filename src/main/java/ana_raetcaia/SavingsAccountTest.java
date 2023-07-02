package ana_raetcaia;

public class SavingsAccountTest {
    public static void main (String[]args){
        BankAccount accountObj1 = new SavingsAccount(5600.43,56.43,90.4);
        System.out.println(accountObj1.withdraw());
        System.out.println(accountObj1.deposit());
    }
}
