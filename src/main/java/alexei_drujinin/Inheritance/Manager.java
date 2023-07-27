package alexei_drujinin.Inheritance;

import alexei_drujinin.Encapsulation.Employee;

public class Manager extends Employee {
    private String department;
    private int numberOfEmployees;


    public Manager(String department, int numberOfEmployees, int employeeId, String name, int salary) {
        super(employeeId, name, salary);
        setDepartment(department);
        setNumberOfEmployees(numberOfEmployees);

    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
