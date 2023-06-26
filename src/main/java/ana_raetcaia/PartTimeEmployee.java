package ana_raetcaia;

import ana_raetcaia.task_six.Employee;

public class PartTimeEmployee extends Employee {
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
