package VictorMurashev.homework_20240723.abstraction;

public class PartTimeEmployee extends Employee{
    private double hourRate;
    private int hourWork;

    public PartTimeEmployee(String name, int id, double hourRate, int hourWork) {
        super(name, id);
        this.hourRate = hourRate;
        this.hourWork = hourWork;
    }

    @Override
    public double calculateSalary() {
        return hourRate * hourWork;
    }
}
