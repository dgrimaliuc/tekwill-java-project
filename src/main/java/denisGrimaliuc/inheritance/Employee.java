package main.java.denisGrimaliuc.inheritance;

/**
 * Creați o clasă numită „Employee” cu variabile de instanță pentru ID-ul angajatului, nume și salariu.
 */
public class Employee {
    int employeeID;
    String name;
    double salary;

    Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
}
