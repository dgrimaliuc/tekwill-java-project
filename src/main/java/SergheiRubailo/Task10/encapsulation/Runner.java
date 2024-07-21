package SergheiRubailo.Task10.encapsulation;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("BMW");
        car.setModel("X5");
        car.setYear(2024);
        System.out.println(car.toString());

        Employee employee = new Employee();

        employee.setEmployeeId(1);
        employee.setName("John");
        employee.setSalary(1000);
        System.out.println(employee.toString());

    }
}
