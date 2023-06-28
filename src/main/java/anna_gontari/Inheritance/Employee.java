package anna_gontari.Inheritance;
//Create a class named "Employee" with instance variables for employee ID, name, and salary.
// Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables
// such as department and number of employees managed, create constructors to initialize all variables.
public class Employee {
    private int ID;
    private String name;
    private int salary;
    public Employee(int ID, String name, int salary) {
        setId(ID);
        setName(name);
        setSalary(salary);
    }
    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
