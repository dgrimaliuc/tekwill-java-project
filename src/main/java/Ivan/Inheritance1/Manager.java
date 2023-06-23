package Ivan.Inheritance1;

import Ivan.Encapsulation1.Employee;

public class Manager extends Employee {
    private String department;
    private int numberOfEmployeesManaged;

    public Manager(int employeeID, String name, double salary, String department, int numberOfEmployeesManaged) {
        super(employeeID, name, salary);
        this.department = department;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    // Getter and Setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter and Setter methods for numberOfEmployeesManaged
    public int getNumberOfEmployeesManaged() {
        return numberOfEmployeesManaged;
    }

    public void setNumberOfEmployeesManaged(int numberOfEmployeesManaged) {
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }
}