package cristina_savrin.oop.encapsulation;

import java.util.ArrayList;
import java.util.HashMap;

public class EncapsulationTest {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "BMW Group", 2019);
        System.out.println("My car is: " + car1.getModel() + ", " + car1.getMake() + ", " + car1.getYear());
        car1.setModel("Honda Jazz");
        car1.setMake("Honda");
        car1.setYear(2015);
        System.out.println("My new car is: " + car1.getModel() + ", " + car1.getMake() + ", " + car1.getYear());

        Employee employee1 = new Employee(358, "Michael Moon", 1500);
        System.out.println("\nEmployee: " + employee1.getId() + " " + employee1.getName() + ", " + employee1.getSalary() + "$");
        employee1.setSalary(2000);
        System.out.println("Employee's new salary: " + employee1.getId() + " " + employee1.getName() + ", " + employee1.getSalary() + "$");

        Product product1 = new Product("A035", "Milk JLC, 1L", 11);
        System.out.println("\nProduct: " + product1.getProductID() + " " + product1.getProductName() + ", " + product1.getProductPrice() + "MDL");
        product1.setProductName("Milk Casuta Mea, 1L");
        product1.setProductPrice(13);

        System.out.println("Product: " + product1.getProductID() + " " + product1.getProductName() + ", " + product1.getProductPrice() + "MDL");

        // 2. Create a List of Employees with some objects inside, print all objects info in a foreach loop.
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee2 = new Employee(360, "David Braun", 1300);
        Employee employee3 = new Employee(361, "Alice Miller", 1800);
        Employee employee4 = new Employee(362, "Fred Collins", 1150);
        Employee employee5 = new Employee(363, "Henry Smith", 2200);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println("\nOur team: ");
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + ", " + employee.getSalary() + "$");
        }

        // Create a Map that stores the abbreviator as keys and Country type as value.
        // Add some pairs to the map and retrieve the capital of a specific country.
        HashMap<String, Country> countries = new HashMap<>();
        countries.put("MD", new Country("Moldova", "Chisinau"));
        countries.put("FR", new Country("France", "Paris"));
        countries.put("IT", new Country("Italy", "Rome"));
        countries.put("RO", new Country("Romania", "Bucharest"));
        countries.put("IN", new Country("India", "New Delhi"));

        System.out.println("\nThe capital of " + countries.get("IT").getName() + " is " + countries.get("IT").getCapital());
    }
}