package main.java.LiliaRosca.encapsulation_inheritance.HW;

public class main_HW {
    public static void main(String[] args) {
// 1. Class „BankAccount” cu variabile - numărul contului, sold și numele titularului contului.
// Subclass „DepozitAccount” care moștenește de la „BankAccount” și variabile suplimentare - rata dobânzii și soldul minim.

        /*DepozitAccount account = new DepozitAccount("112345679", 1000.11, "Duglas Smith", 10.5, 100.00);
        System.out.println(account);*/

// 2. Class „Shape” cu variabile - culoare și statutul de umplere.
// Subclass „Rectangle” care moștenește de la „Shape” și variabile suplimentare - lățimea și înălțimea.

        /*Rectangle square = new Rectangle("Blue", true, 10, 10);
        System.out.println(square);*/

// 3. Class „Animal” cu variabile - nume, vârstă și sunet.
// Subclass „Cat” care moștenește de la „Animal” și variabile suplimentare - rasa și greutatea.

        /*Cat naughty = new Cat("Misty", 1, "meow", "egyptian", 3.5);
        System.out.println(naughty);*/

// 4. Class „Employee” cu variabile - ID-ul angajatului, nume și salariu.
// Subclass „Intern” care moștenește de la „Employee” și variabile suplimentare - numele școlii și durata stagiului.
// 5. Class „Person” cu variabile - nume, vârstă și adresă.
// Subclass „Employee” care moștenește de la „Person” și variabile suplimentare - ID-ul angajatului și salariul.
// Person (nume, vârstă și adresă) > Employee (ID-ul angajatului, salariu) > Intern (numele școlii și durata stagiului)

        Intern freshFish = new Intern("John Doe", 21, "Citezen of Univers", 1001, 500.05, "Sorbonne", 0.5);
        System.out.println(freshFish);

    }
}