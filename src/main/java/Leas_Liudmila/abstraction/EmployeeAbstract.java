package Leas_Liudmila.abstraction;

//Create an abstract class called "Employee" with an abstract method named "calculateSalary".
//Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement the "calculateSalary" method differently in each subclass.
public abstract class EmployeeAbstract {

    protected final double TAX = 0.23;
    public abstract double calculateSalary();

}
