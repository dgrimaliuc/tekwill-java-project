package anna_gontari.Inheritance;
//Create a class named "Employee" with instance variables for employee ID, name, and salary.
// Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables
// such as department and number of employees managed, create constructors to initialize all variables.
public class Manager extends Employee {
    private String department;
    private int ManagedEmployees;
    public Manager(int id, String name, int salary, String department, int ManagedEmployees) {
        super(id, name, salary);
        setDepartment(department);
        setManagedEmployees(ManagedEmployees);
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getManagedEmployees() {
        return ManagedEmployees;
    }
    public void setManagedEmployees(int ManagedEmployees) {
        this.ManagedEmployees = ManagedEmployees;
    }


}