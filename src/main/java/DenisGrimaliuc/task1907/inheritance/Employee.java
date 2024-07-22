package DenisGrimaliuc.task1907.inheritance;

/*
   4. Create a class named "Employee" with instance variables for employee ID, name, and salary.
   Design a subclass called "Manager" that inherits from "Employee"
   and includes additional instance variables such as
   department and number of employees managed.
 */
public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nemployeeID=" + employeeID +
                ", \nname='" + name + '\'' +
                ", \nsalary=" + salary +
                '}';
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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
