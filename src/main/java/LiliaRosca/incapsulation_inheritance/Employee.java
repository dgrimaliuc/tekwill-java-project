package main.java.LiliaRosca.incapsulation_inheritance;

/* Creați o clasă numită „Employee” cu variabile de instanță private pentru ID-ul angajatului, nume și salariu.
 * Includeți metode getter și setter corespunzătoare pentru fiecare variabilă.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}