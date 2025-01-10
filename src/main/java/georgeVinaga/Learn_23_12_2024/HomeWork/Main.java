package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;


public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------------------------
        // Lucreaza cu class BankAccount si DepozitAccount
//        DepozitAccount depozitAccount = new DepozitAccount(1, 100, "Denis", 0.1, 50);
//        depozitAccount.print();

        //-----------------------------------------------------------------------
        // Lucreaza cu class Shape si Retangle
//        Retangle retangle = new Retangle(10, 20, "red", false);
//        retangle.print();
//        System.out.println(retangle.getArea());
//        System.out.println(retangle.getPerimeter());

        //-----------------------------------------------------------------------
        // Lucreaza cu class Animal, Cat si Dog
        Cat cat = new Cat("Barsic", 5, "Meow", "Siamese", 5.5);
        cat.animalSound();
        cat.print();
        Dog dog = new Dog("Buran", 5, "Gaw");
        dog.animalSound();
        dog.print();

        //-----------------------------------------------------------------------

    }
}
