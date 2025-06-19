package main.java.lilia_toma;

/**
 * Creati o clasa numita "Employee" cu variabile de instanta private pentru ID-ul angajatului, nume si salariu.
 * Includeti metode getter si setter corespunzatoare pentru fiecare variabila.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
