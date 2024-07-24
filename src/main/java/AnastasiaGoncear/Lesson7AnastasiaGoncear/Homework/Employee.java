package AnastasiaGoncear.Lesson7AnastasiaGoncear.Homework;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();
}
