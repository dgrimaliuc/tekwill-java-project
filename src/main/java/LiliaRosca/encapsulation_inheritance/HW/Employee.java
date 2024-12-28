package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 4-5 moștenește de la Person + ID-ul angajatului, salariu

public class Employee extends Person {
    int idEmployee;
    Double salary;

    Employee(String fullName, int age, String address, int idEmployee, Double salary) {
        super(fullName, age, address);
        this.idEmployee = idEmployee;
        this.salary = salary;
    }
}
