package cristina_savrin.oop.abstraction;

/**
 * 3. Create an abstract class called "Employee" with an abstract method named "calculateSalary".
 * Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement the "calculateSalary" method differently in each subclass.
 */
public class PartTimeEmployee extends Employee {
    private int hourlyWage;

    public PartTimeEmployee(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public int calculateSalary() {
        return hourlyWage * 4 * 246; // (260 working days - 14 vacation days = 246)
    }
}
