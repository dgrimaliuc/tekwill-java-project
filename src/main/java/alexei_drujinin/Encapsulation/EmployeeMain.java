package alexei_drujinin.Encapsulation;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manager = new Employee(1,"Alex",20000);
        System.out.println("Employee ID: "+manager.getEmployeeId());
        System.out.println("Name "+manager.getName());
        System.out.println("salary "+ manager.getSalary());

        ArrayList<Employee> employees = new ArrayList<>();
        Employee designer = new Employee(7, "Noah", 12000);
        employees.add(designer);
        Employee director = new Employee(3, "Jack", 30000);
        employees.add(director);


        for (var employee : employees) {
            System.out.println(employee.getEmployeeId() + "\t | " + employee.getName() + "\t | " + employee.getSalary());

        }

    }
}
