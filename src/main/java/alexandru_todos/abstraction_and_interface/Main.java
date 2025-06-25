package main.java.alexandru_todos.abstraction_and_interface;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(12);
        System.out.println("Daily salary of full-time worker is: " + fullTimeEmployee.calculateSalary() + "$");
        Employee partTimeEmployee = new PartTimeEmployee(10);
        System.out.println("Daily salary of part-time worker is: " + partTimeEmployee.calculateSalary() + "$");
        Printable[] items = new Printable[]{
                new Book("Metro 2033", "Dmitri Gluhovski", 14.99),
                new Book("Martin Eden", "Jack London", 9.95),
                new Magazine("Time", "TIME USA LLC"),
                new Magazine("Vogue", "Conde Nast")
        };
        for (Printable item : items) {
            item.print();
        }
    }
}