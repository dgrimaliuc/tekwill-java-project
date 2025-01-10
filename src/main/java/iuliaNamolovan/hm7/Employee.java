package main.java.iuliaNamolovan.hm7;

public class Employee {
    int employeeID;
    String name;
    double salary;

    public Employee(int eID, String n, double s) {
        this.employeeID = eID;
        this.name = n;
        this.salary = s;
    }

    public String toString() {
        return "Employee{" +
                "ID=" + employeeID +
                ", Name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }
}

