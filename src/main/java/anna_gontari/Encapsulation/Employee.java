package anna_gontari.Encapsulation;

public class Employee {

    //Create a class named "Employee" with private instance variables for employee ID, name, and salary.
    // Include appropriate getter and setter methods for each variable.

    private int ID;
    private String name;
    private int salary;

    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
