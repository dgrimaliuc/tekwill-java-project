package main.java.denis_grimaliuc.inheritance;

public class PartTimeEmployee extends Employee2 {
    public PartTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public double calculateSalary() {
        return 30 * salaryPerHour * 4;
    }
}
