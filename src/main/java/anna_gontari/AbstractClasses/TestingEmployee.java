package anna_gontari.AbstractClasses;

public class TestingEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(20, 40);
        System.out.println("Full time employee gets: " + fullTimeEmployee.calculateSalary());
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee( 5, 20);
        System.out.println("Part time employee gets: " + partTimeEmployee.calculateSalary());
    }
}
