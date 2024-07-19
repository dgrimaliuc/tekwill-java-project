package DenisGrimaliuc.task1907.inheritance;

/*
   4. Create a class named "Employee" with instance variables for employee ID, name, and salary.
   Design a subclass called "Manager" that inherits from "Employee"
   and includes additional instance variables such as
   department and number of employees managed.
 */
public class Manager extends Employee {
    private String department;
    private int employeesManagedCount;

    public Manager(int employeeID, String name, double salary, String department, int employeesManagedCount) {
        super(employeeID, name, salary);
        this.department = department;
        this.employeesManagedCount = employeesManagedCount;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
        System.out.println("Employees managed: " + employeesManagedCount);
    }

    @Override
    public String toString() {
        return super.toString() + "\nManager{" +
                "\ndepartment='" + department + '\'' +
                ", \n employeesManagedCount=" + employeesManagedCount +
                '}';
    }
}
