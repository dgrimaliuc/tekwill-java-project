package main.java.denis_grimaliuc.inheritance;


import main.java.denis_grimaliuc.interfaces.IAnimal;

/**
 * /**
 * * Creați o subclasă numită „Cat” care moștenește de la „Animal” și include
 * * * variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */

public class Cat implements IAnimal {
    public String breed;
    public double weight;

    public Cat() {
        this.breed = "Unknown";
        this.weight = 0.0;

    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void makeSound() {
        System.out.println("Cat makes sound meow");
    }

    @Override
    public String toString() {

        return "Cat{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
