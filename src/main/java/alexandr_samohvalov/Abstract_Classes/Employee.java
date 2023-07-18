package alexandr_samohvalov.Abstract_Classes;
//Create an abstract class called "Employee" with an abstract method named "calculateSalary".
//Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement the "calculateSalary" method differently in each subclass.
public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
