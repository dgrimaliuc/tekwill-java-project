package AnastasiaGoncear.Lesson6AnastasiaGoncear;

public class BankAccountRunner {
    public static void main(String[] args) {


        BankAccount bankaccount1 = new BankAccount(1, 2000, "LauraSmith");
        BankAccount bankaccount2 = new BankAccount(2, 3000, "RickDoulby");
        System.out.println("Employee name1  " + bankaccount1.getNameHolder());
        System.out.println("Employee name2  " + bankaccount2.getNameHolder());

        bankaccount2.setNameHolder("Nastea");
        System.out.println("Employee name2  " + bankaccount2.getNameHolder());
    }
}
