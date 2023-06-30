package serghei_condrasov.abstraction;

public class ObjectEmployee {

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculateSalary();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculateSalary();
    }
}
