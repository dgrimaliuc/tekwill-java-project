package roman_marcov.Encapsulation;

public class Employee {
//   2. Create a class named "Employee" with private instance variables for employee ID, name, and salary.
//      Include appropriate getter and setter methods for each variable.

    private int employeeID, employeeSalary;
    private String employeeName;


    public Employee(int employeeID, String employeeName, int employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return employeeID;
    }

    public void setId(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return employeeName;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return employeeSalary;
    }

    public void setSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

}
