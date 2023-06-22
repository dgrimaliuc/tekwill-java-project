package cristina_savrin.oop.abstraction;

import cristina_savrin.oop.encapsulation.Employee;

public class AbstractionTest {

    public static void main(String[] args) {

        Shape circle = new Circle(18.5);
        System.out.println("The area of circle is equal to: " + circle.calculateArea());

        Shape rectangle = new Rectangle(5, 8);
        System.out.println("The area of rectangle is equal to: " + rectangle.calculateArea());

        FullTimeEmployee fullTimeEmpl = new FullTimeEmployee(30);
        System.out.println("\nThe year salary for full time employee: $" + fullTimeEmpl.calculateSalary());

        PartTimeEmployee partTimeEmpl = new PartTimeEmployee(30);
        System.out.println("The year salary for part time employee: $" + partTimeEmpl.calculateSalary());

        SavingsAccount savings = new SavingsAccount(5600.50);
        savings.withdraw(55.40);
        savings.deposit(500);
        System.out.println("\nThe final balance of savings account: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount(800);
        checking.withdraw(360.50);
        checking.deposit(1000);
        System.out.println("The final balance of checking account: " + checking.getBalance());
    }
}