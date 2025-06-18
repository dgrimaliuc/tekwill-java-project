package main.java.alexandru_todos;

public class Encapsulation {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setModel("Dacia");
        myCar.setYear(2015);
        myCar.setKilometreage(100000);
        System.out.println("Task 1: My car is " + myCar.getModel() + ", from year "
                + myCar.getYear() + ". It has this kilometreage: " + myCar.getKilometreage() + " km");

        Employee employee = new Employee();
        employee.setEmployeeID(12345);
        employee.setName("Ivan");
        employee.setSalary(1500);
        System.out.println("Task 2: Our new employee is " + employee.getName() + " with ID: "
                + employee.getEmployeeID() + ". His salary is: " + employee.getSalary() + "$");
    }
}
