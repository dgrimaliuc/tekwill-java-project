package main.java.Magda_Petrachi.interfata;

public class FullTimeEmployee extends abstractEmployee {

    public FullTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        final double v = salaryPerHour * 8;
        return v;
    }
}

