package main.java.denis_grimaliuc.inheritance;


/**
 * Creați o subclasă numită „Dog” care moștenește de la „Animal” și include
 * * variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */
public class Dog extends Animal {
    public String breed;


    public double weight;

    public Dog(String name, int age, String breed, double weight) {
        super(name, age, "Dog", "Woof");
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound: " + sound);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}

