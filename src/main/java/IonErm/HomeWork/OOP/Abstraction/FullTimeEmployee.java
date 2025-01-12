package main.java.IonErm.HomeWork.OOP.Abstraction;

public class FullTimeEmployee extends Employee {

    int salaryHour = 20;
    int hoursWorked = 40;

    @Override
    public void calculateSalary() {
        System.out.println("The salary for Full Time employer: " + salaryHour * hoursWorked);

    }
}
