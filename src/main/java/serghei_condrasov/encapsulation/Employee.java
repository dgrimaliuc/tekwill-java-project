package serghei_condrasov.encapsulation;

public class Employee {

    /*Encapsulation
    2. Create a class named "Employee" with private instance variables for employee ID, name, and salary.
    Include appropriate getter and setter methods for each variable.*/
    /*Inheritance
    2. Create a class named "Employee" with instance variables for employee ID, name, and salary.*/

    private String ID;
    private String name;
    private double salary;

    public Employee(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
