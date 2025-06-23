package main.java.denis_grimaliuc.inheritance;


import main.java.denis_grimaliuc.interfaces.IAnimal;

/**
 * Creați o subclasă numită „Dog” care moștenește de la „Animal” și include
 * * variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */
public class Dog implements IAnimal {
    public String breed;


    public double weight;

    public Dog(String name, int age, String breed, double weight) {
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound bark");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}

