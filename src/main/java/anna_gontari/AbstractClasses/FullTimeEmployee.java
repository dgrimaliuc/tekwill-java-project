package anna_gontari.AbstractClasses;
//Create an abstract class called "Employee" with an abstract method named "calculateSalary".
// Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement
// the "calculateSalary" method differently in each subclass.
public class FullTimeEmployee extends Employee {
    private int dailyRate;
    private int workDaysPerMonth;
    public FullTimeEmployee (int dailyRate, int workDaysPerMonth){
        this.dailyRate = dailyRate;
        this.workDaysPerMonth = workDaysPerMonth;
    }
    @Override
    public double calculateSalary() {
        return dailyRate * workDaysPerMonth;
    }
}
