package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

public class FullTimeEmployee extends Employee{

    private double salary;


    @Override
    public double calculateSalary() {
        return salary;
    }
    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }


}
