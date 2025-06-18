package main.java.denis_grimaliuc.inheritance;


/**
 * /**
 * * Creați o subclasă numită „Cat” care moștenește de la „Animal” și include
 * * * variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */

public class Cat extends Animal {
    public String breed;
    public double weight;

    public Cat() {
        super("Default Cat", 0, "Cat", "Meow");
        this.breed = "Unknown";
        this.weight = 0.0;

    }

    public Cat(String name, int age, String breed, double weight) {
        super(name, age, "Cat", "Meow");
        this.breed = breed;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Cat makes sound: " + sound);
    }

    @Override
    public String toString() {

        return "Cat{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
