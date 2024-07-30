package IngaTitchiev.HW2207;

public class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int employeeID, double annualSalary) {
        super(name, employeeID);
        this.annualSalary = annualSalary;
    }

     @Override
    public double calculateSalary() {
        return annualSalary;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Annual Salary: " + annualSalary);
    }
}

