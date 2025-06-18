package main.java.alexandru_todos;

public class Employee {
    // Create a class named ‘Employee’ with private instance variables for employee ID, name and salary.
    // Include appropriate getter and setter methods for each variable.

    private int employeeID;
    private String name;
    private int salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int newEmployeeID) {
        this.employeeID = newEmployeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }
}
