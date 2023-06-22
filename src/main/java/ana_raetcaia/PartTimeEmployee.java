package ana_raetcaia;

public class PartTimeEmployee extends Employee{
    private double salaryForOneHour;

    private double salary;

    private int hours;

    public PartTimeEmployee(double salaryForOneHour, int hours){
        this.salaryForOneHour = salaryForOneHour;
        this.hours = hours;
    }
    @Override
    public double calculateSalary() {
        salary= salaryForOneHour * hours;
        return salary;

    }
}
