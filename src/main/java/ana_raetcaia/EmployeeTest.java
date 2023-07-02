package ana_raetcaia;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main (String[]args){

        Employee employeeObj = new Employee(45,"Maria", 10000);

        System.out.println("Employee ID: " + employeeObj.getId());
        System.out.println("Employee name: " + employeeObj.getName());
        System.out.println("Employee salary: " + employeeObj.getSalary());

        //Create an List of Employee with some bject inside, print all objects info in a foreach loop.
        ArrayList<String> Employee = new ArrayList<>();

        Employee.add("Ana");
        Employee.add("Ira");
        Employee.add("Ivan");

        for (String x : Employee) {
            System.out.println(x);
        }
    }
}
