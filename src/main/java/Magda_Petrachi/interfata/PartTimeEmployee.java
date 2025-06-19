package main.java.Magda_Petrachi.interfata;

public class PartTimeEmployee extends abstractEmployee {

    public PartTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        final double r = salaryPerHour * 4;
        return r;
    }
}
