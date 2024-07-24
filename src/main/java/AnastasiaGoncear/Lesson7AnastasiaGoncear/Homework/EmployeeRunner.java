package AnastasiaGoncear.Lesson7AnastasiaGoncear.Homework;

public class EmployeeRunner {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 1, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 2, 20, 80);

        System.out.println("Full Time Employee Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println("Part Time Employee Salary: $" + partTimeEmployee.calculateSalary());
    }

}

