package main.java.IonErm.HomeWork.OOP.Abstraction;

public class PartTimeEmployee extends Employee {

    int salaryHour = 20;
    int hoursWorked = 20;

    @Override
    public void calculateSalary() {
        System.out.println("The salary for Part Time employer: " + salaryHour * hoursWorked);
    }
}
