package Lesson6AnastasiaGoncear.Encapsulation;

import Lesson6AnastasiaGoncear.BankAccount;

public class EmployeeRunner {
    public static void main(String[] args) {


    Employee employee1 = new Employee(12345, "Nineli Smith", 2000.60);
        Employee employee2 = new Employee(22345, "Bob Doulby", 5263.25);
    System.out.println("Employee name1  "+  employee1.getName());
    System.out.println("Employee name2  "+  employee2.getName());

    employee2.setSalary(3000.02);
    System.out.println("Employee2 Salary is  "+  employee2.getSalary());
}
}

