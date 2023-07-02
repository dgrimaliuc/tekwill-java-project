package serghei_condrasov.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ObjectEmployee {

    //Create a List of Employee with some object inside, print all objects info in a foreach loop.

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("IV", "Ivanov",5000));
        employees.add(new Employee("PS", "Petrov", 6000));
        employees.add(new Employee("SO", "Shevcenco", 7000));

        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getID() + ", Name - " + employee.getName() +
                               ", Salary - " + employee.getSalary());
        }
    }
}
