package anna_gontari.Inheritance;
//Create a class named "Employee" with instance variables for employee ID, name, and salary.
// Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables
// such as department and number of employees managed, create constructors to initialize all variables.
public class Manager extends Employee {
    String department;
    int managedEmployees;

    public Manager(String department, int managedEmployees) {
        super(25485, "John Johnson", 5000);
        this.department = department;
        this.managedEmployees = managedEmployees;
    }
    Manager (int ID, String name, int salary,String department, int managedEmployees) {
        super (ID, name,salary);
        this.department = department;
        this.managedEmployees = managedEmployees;

    }
}
