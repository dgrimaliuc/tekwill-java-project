package Leas_Liudmila.Encapsulation;

//1.Create a class named "Employee" with private instance variables for employee ID, name, and salary. Include appropriate getter and setter methods for each variable. (Encapsulation)

//2. Create a class named "Employee" with instance variables for employee ID, name, and salary. Design a subclass called "Manager" that inherits from "Employee" and includes additional
// instance variables such as department and number of employees managed, create constructors to initialize all variables.
public class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee() {

    }

    //used in task for Inheritance
    public Employee(int id, String name, float salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
