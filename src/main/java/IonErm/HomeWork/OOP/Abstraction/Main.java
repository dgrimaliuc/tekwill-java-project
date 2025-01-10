package main.java.IonErm.HomeWork.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee part = new PartTimeEmployee();
        part.calculateSalary();
        FullTimeEmployee full = new FullTimeEmployee();
        full.calculateSalary();
    }
}
