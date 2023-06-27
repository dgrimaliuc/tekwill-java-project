package alexandr_samohvalov.Inheritance;

import alexandr_samohvalov.Encapsulation.Employee;
//Design a subclass called "Manager" that inherits from "Employee" and includes additional instance variables such as department and number of employees managed,
// create constructors to initialize all variables.

public class Manager extends Employee {
    private String department;
    private double number_of_employees_managed;

    public Manager(String employee_ID, String name, int salary, String department, double number_of_employees_managed) {
        super(employee_ID, name, salary);
        this.department = department;
        this.number_of_employees_managed = number_of_employees_managed;
    }
}
