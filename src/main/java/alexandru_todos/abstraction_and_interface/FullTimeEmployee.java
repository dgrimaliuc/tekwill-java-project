package main.java.alexandru_todos.abstraction_and_interface;

public class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        return salaryPerHour * 8;
    }

}