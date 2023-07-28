package alexei_drujinin.AbstractClasses;


public class EmployeeMain {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1000, 20);
        System.out.println("Full time employee gets: " + fullTimeEmployee.calculateSalary());
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(100, 170);
        System.out.println("Part time employee gets: " + partTimeEmployee.calculateSalary());
    }
}
