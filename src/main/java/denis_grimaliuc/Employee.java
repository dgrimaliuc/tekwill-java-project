package main.java.denis_grimaliuc;


/**
 * Creați o clasă numită „Employee” cu variabile de instanță private pentru ID-ul angajatului, nume și salariu.
 * Includeți metode getter și setter corespunzătoare pentru fiecare variabilă.
 */
public class Employee {
    private double id;
    private String name;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
