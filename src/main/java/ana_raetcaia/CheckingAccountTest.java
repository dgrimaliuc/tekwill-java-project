package ana_raetcaia;

public class CheckingAccountTest {
    public static void main (String[]args){
        BankAccount accountObj = new CheckingAccount(700.34, 434.03);
        System.out.println(accountObj.deposit());
        System.out.println(accountObj.withdraw());

    }
}
