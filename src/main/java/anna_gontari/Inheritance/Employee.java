package anna_gontari.Inheritance;
//Create a class named "Employee" with instance variables for employee ID, name, and salary.
// Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables
// such as department and number of employees managed, create constructors to initialize all variables.
public class Employee {
    int ID;
    String name;
    int salary;
    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
}

