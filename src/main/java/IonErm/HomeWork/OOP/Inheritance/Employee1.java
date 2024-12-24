package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Employee1 extends Person {
    public int employeeID;
    public double salary;

    Employee1(String name, int age, String address, int employeeID, double salary) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
