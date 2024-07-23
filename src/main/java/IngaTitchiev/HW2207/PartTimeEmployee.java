package IngaTitchiev.HW2207;

public class PartTimeEmployee extends Employee {
    private double hourRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeID, double hourRate, int hoursWorked) {
        super(name, employeeID);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourRate * hoursWorked;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print common details
        System.out.println("Hour Rate: " + hourRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

