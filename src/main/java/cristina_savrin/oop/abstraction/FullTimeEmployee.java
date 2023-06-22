package cristina_savrin.oop.abstraction;

/**
 * 3. Create an abstract class called "Employee" with an abstract method named "calculateSalary".
 * Create two subclasses of Employee, such as "FullTimeEmployee" and "PartTimeEmployee", and implement the "calculateSalary" method differently in each subclass.
 */
public class FullTimeEmployee extends Employee {

    private int hourlyWage;

    public FullTimeEmployee(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public int calculateSalary() {
        return hourlyWage * 8 * 232; // (260 working days - 28 vacation days = 232)
    }
}
