package alexei_drujinin.AbstractClasses;

public class PartTimeEmployee extends Employee {
    public int hourlyRate;
    public int hoursPerMonth;

    public PartTimeEmployee(int hourlyRate, int hoursPerMonth) {
        this.hourlyRate = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursPerMonth;
    }
}
