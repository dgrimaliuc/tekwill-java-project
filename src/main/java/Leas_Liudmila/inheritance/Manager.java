package Leas_Liudmila.inheritance;

import Leas_Liudmila.encapsulation.Employee;

public class Manager extends Employee {

    private String department;
    private int numberOfEmployees;

    public Manager(int id, String name, float salary, String department, int numberOfEmployees) {
        super(id, name, salary);
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
