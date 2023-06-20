package Leas_Liudmila.abstraction;

import java.util.ArrayList;

public class SalaryMain {

    public static void main(String[] args) {
        ArrayList<FullTimeEmployee> employees = new ArrayList<>();
        FullTimeEmployee tester = new FullTimeEmployee(11542.26);
        employees.add(tester);

        FullTimeEmployee programmer = new FullTimeEmployee(15160);
        employees.add(programmer);

        FullTimeEmployee designer = new FullTimeEmployee(14265.84);
        employees.add(designer);

        for (var employeeFull : employees) {
            System.out.println(employeeFull.calculateSalary());
        }

        ArrayList<PartTimeEmployee> employeesPart = new ArrayList<>();
        PartTimeEmployee accountant = new PartTimeEmployee(150.0);
        accountant.setHoursWorked(3.5);
        employeesPart.add(accountant);

        PartTimeEmployee productOwner = new PartTimeEmployee(600.0);
        productOwner.setHoursWorked(10);
        employeesPart.add(productOwner);

        for (var employeesPartTime : employeesPart) {
            System.out.println(employeesPartTime.calculateSalary());
        }

    }
}