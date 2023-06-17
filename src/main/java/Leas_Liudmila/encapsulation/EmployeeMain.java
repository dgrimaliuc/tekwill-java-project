package Leas_Liudmila.encapsulation;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manager = new Employee();
        manager.setId(1);
        manager.setName("Alex");
        manager.setSalary(1255.6f);

        Employee director = new Employee();
        director.setId(2);
        director.setName("Sid");
        director.setSalary(100500.55f);

        System.out.println(manager.getId() + " " + manager.getName() + " " + manager.getSalary());
        System.out.println(director.getId() + " " + director.getName() + " " + director.getSalary());

        //Create a List of Employee with some object inside, print all objects info in a foreach loop.

        ArrayList<Employee> employees = new ArrayList<>();
        Employee consultant = new Employee(3, "Nick", 8515.98f);
        employees.add(consultant);
        Employee programmer = new Employee(4, "Liam", 15018.45f);
        employees.add(programmer);
        Employee accountant = new Employee(5, "Emma", 6235.15f);
        employees.add(accountant);
        Employee tester = new Employee(6, "Luna", 12045.77f);
        employees.add(tester);
        Employee designer = new Employee(7, "Noah", 13125.62f);
        employees.add(designer);

        for (var employee : employees) {
            System.out.println(employee.getId() + "\t | " + employee.getName() + "\t | " + employee.getSalary());

        }

    }
}
