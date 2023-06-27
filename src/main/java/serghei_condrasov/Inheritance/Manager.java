package serghei_condrasov.Inheritance;

import serghei_condrasov.encapsulation.Employee;

public class Manager extends Employee {

    /*Inheritance
    2. Design a subclass called "Manager" that inherits from "Employee"
    and includes additional instance variables such as department and number of employees managed, create constructors to initialize all variables.*/

    private String department;
    private int numberOfEmployeesManaged;

    public Manager(String ID, String name, double salary, String department, int numberOfEmployeesManaged) {
        super(ID, name, salary);
        this.department = department;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfEmployeesManaged() {
        return numberOfEmployeesManaged;
    }

    public void setNumberOfEmployeesManaged(int numberOfEmployeesManaged) {
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }
}
