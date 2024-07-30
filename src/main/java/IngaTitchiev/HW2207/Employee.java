package IngaTitchiev.HW2207;

public abstract class Employee {
    private String name;
    private int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }


    public abstract double calculateSalary();


    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
    }
}

