package main.java.alexandru_todos.abstraction_and_interface;

public class PartTimeEmployee extends Employee {

    PartTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        return salaryPerHour * 4;
    }
}
