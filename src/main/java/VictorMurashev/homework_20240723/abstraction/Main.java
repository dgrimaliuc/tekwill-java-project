package VictorMurashev.homework_20240723.abstraction;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John Doe", 777, 7770);
        Employee partTimeEmployee = new PartTimeEmployee("John Smith", 778, 35, 160);

        System.out.println("Full time employee salary is " + fullTimeEmployee.calculateSalary());
        System.out.println("Part time employee salary is " + partTimeEmployee.calculateSalary());
    }
}
