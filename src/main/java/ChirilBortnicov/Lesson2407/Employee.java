package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

public abstract class Employee {
    //Create an abstract class called “Employee” with an abstract method named “calculateSalary”.
    // Create two subclasses of Employee, such as “FullTimeEmployee” and “PartTimeEmployee”,
    // and implement the “calculateSalary” method differently in each subclass.
    public abstract double calculateSalary();

    protected String name;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
    public Employee(String name) {
        this.name = name;
    }
}
