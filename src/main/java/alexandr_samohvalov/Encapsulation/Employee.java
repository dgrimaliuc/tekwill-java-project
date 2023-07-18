package alexandr_samohvalov.Encapsulation;
//Create a class named "Employee" with private instance variables for employee ID, name, and salary. Include appropriate getter and setter methods for each variable.
public class Employee {
    private String employeeId ;
    private String name ;
    private int salary ;
    // for Inheritance
    public Employee(String employee_ID, String name, int salary) {
        this.employeeId = employee_ID;
        this.name = name;
        this.salary = salary;
    }
    public String getEmployee_ID(){
        return employeeId;
    }
    public void setEmployee_ID(String employee_ID) {
        this.employeeId = employee_ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
