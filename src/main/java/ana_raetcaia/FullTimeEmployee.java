package ana_raetcaia;

public class FullTimeEmployee extends Employee {


private double salaryForOneHour;

private double salary;

public FullTimeEmployee(double salaryForOneHour){
    this.salaryForOneHour = salaryForOneHour;
}
    @Override
    public double calculateSalary() {
        salary= salaryForOneHour*40;
        return salary;
    }
}
