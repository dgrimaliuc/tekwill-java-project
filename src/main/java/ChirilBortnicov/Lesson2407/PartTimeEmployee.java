package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

public class PartTimeEmployee extends Employee{

    int rate;
    int hours;

    public PartTimeEmployee(String name, int rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return rate * hours;
    }
}
