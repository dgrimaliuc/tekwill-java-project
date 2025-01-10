package main.java.denisGrimaliuc.inheritance;

/**
 * Creați o subclasă numită „Dog” care moștenește de la „Animal” și include variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */
public class Dog extends Animal {
    String breed;
    int weight;

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

    Dog(String name, int age, String type, String sound, String breed, int weight) {
        super(name, age, type, sound);
        this.breed = breed;
        this.weight = weight;
    }
}
