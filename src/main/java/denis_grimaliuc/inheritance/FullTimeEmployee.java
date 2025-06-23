package main.java.denis_grimaliuc.inheritance;

public class FullTimeEmployee extends Employee2 {
    public FullTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        return 30 * salaryPerHour * 8;
    }
}
