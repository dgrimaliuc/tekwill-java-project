package main.java.denis_grimaliuc.inheritance;


/**
 * Implementați o clasă numită „Animal” cu variabile de instanță pentru nume, vârstă,
 * tip și sunet. Creați o subclasă numită „Dog” care moștenește de la „Animal” și include
 * variabile de instanță suplimentare,
 * cum ar fi rasa și greutatea.
 */


public abstract class Animal {


    public String name;
    public int age;
    public String type;
    public String sound;

    public Animal(String name, int age, String type, String sound) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.sound = sound;
    }


    /**
     * Creează o clasă numită “Animal” cu o metodă numită “makeSound”.
     * Implementează subclase precum “Dog”, “Cat”
     * care suprascriu metoda “makeSound” pentru a produce sunete diferite.
     */
    public abstract void makeSound();
}
