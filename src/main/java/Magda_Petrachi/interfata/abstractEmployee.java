package main.java.Magda_Petrachi.interfata;

public abstract class abstractEmployee {
    protected double salaryPerHour;

    public abstractEmployee(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public abstract double calculateSalary();
}
