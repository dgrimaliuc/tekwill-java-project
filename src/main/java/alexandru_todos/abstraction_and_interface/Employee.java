package main.java.alexandru_todos.abstraction_and_interface;


// Create an abstract class named ‘Employee’ with an abstract method named ‘calculateSalary’
// and a salaryPerHour variable. Creates two subclasses of the Employee class,
// such as ‘FullTimeEmployee’ and “PartTimeEmployee”, and implements the ‘calculateSalary’ method differently
// in each subclass.
public abstract class Employee {
    double salaryPerHour;

    public Employee(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public abstract double calculateSalary();
}
