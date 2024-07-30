package IngaTitchiev.HW2207;

public class Runner {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Ala Botnaru", 100, 15000);
        fullTimeEmployee.printDetails();
        System.out.println("Calculated Salary: " + fullTimeEmployee.calculateSalary());

        Employee partTimeEmployee = new PartTimeEmployee("Ion Popa", 101, 20, 60);
        partTimeEmployee.printDetails();
        System.out.println("Calculated Salary: " + partTimeEmployee.calculateSalary());

        Printable[] printables = new Printable[4];

        printables[0] = new Book("Java", "F. Scott Smith", 30.99);
        printables[1] = new Book("C++", "A. Braicov", 20.99);
        printables[2] = new Magazine("CSJM", "IMI VA");
        printables[3] = new Magazine("BASM", "IMI VA");

        for (Printable printable : printables) {
            printable.print();
            System.out.println();
        }
    }
}
