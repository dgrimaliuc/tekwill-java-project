package main.java.iuliaNamolovan.hm7;

public class Employee2 extends Person {
    int employeeID;
    double salary;


    Employee2(String n, int a, String ad, int emID, double sal) {
        super(n, a, ad); // Apelăm constructorul clasei Person
        this.employeeID = emID;
        this.salary = sal;
    }


    public String toString() {
        return super.toString() +
                ", Employee{" +
                "ID=" + employeeID +
                ", Salary=" + salary +
                '}';
    }
}

