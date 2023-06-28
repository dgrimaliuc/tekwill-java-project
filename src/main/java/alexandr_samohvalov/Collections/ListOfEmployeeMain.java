package alexandr_samohvalov.Collections;

import alexandr_samohvalov.Encapsulation.Employee;

import java.util.ArrayList;
import java.util.List;
//Create an List of Employee with some oject inside, print all objects info in a foreach loop.
public class ListOfEmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("employee 11", "Alex", 12341);
        Employee employee2 = new Employee("employee 112", "Anna", 1121);
        Employee employee3 = new Employee("employee 113", "John", 22223);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployee_ID());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}
