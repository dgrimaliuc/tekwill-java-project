package main.java.alexandru_todos.inheritance_and_polymorphism;

//Proiectați o subclasă numită „Employee” care moștenește de la „Person” și include variabile
// de instanță suplimentare, cum ar fi ID-ul angajatului și salariul.

public class Employee extends Person {
    public int ID;
    public int salary;

    public Employee(String name, int age, String address, int ID, int salary) {
        super(name, age, address);
        this.ID = ID;
        this.salary = salary;
    }
}
