package anna_gontari.AbstractClasses;
//Create an abstract class called "Employee" with an abstract method named "calculateSalary".
// Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement
// the "calculateSalary" method differently in each subclass.
public class PartTimeEmployee extends Employee{
    private int hourlyRate;
    private int workHoursPerMonth;
    public PartTimeEmployee (int hourlyRate, int workHoursPerMonth){
        this.hourlyRate = hourlyRate;
        this.workHoursPerMonth = workHoursPerMonth;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * workHoursPerMonth;
    }
}