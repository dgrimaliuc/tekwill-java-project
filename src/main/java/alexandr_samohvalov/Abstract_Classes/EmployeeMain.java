package alexandr_samohvalov.Abstract_Classes;

public class EmployeeMain {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 5000.0);
        double fullTimeSalary = fullTimeEmployee.calculateSalary();
        System.out.println(fullTimeEmployee.getName() + "'s Salary: " + fullTimeSalary);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 15.0, 20);
        double partTimeSalary = partTimeEmployee.calculateSalary();
        System.out.println(partTimeEmployee.getName() + "'s Salary: " + partTimeSalary);
    }
}
