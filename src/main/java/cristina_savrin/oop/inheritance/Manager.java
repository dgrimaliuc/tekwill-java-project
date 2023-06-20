package cristina_savrin.oop.inheritance;

import cristina_savrin.oop.encapsulation.Employee;

/**
 * Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables
 * such as department and number of employees managed, create constructors to initialize all variables.
 */
public class Manager extends Employee {

    private String department;
    private int spanOfControl;

    public Manager(int employeeID, String employeeName, int employeeSalary, String department, int spanOfControl) {
        super(employeeID, employeeName, employeeSalary);
        this.department = department;
        this.spanOfControl = spanOfControl;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSpanOfControl() {
        return spanOfControl;
    }

    public void setSpanOfControl(int spanOfControl) {
        this.spanOfControl = spanOfControl;
    }
}
