package Ivan.Inheritance1;

import Ivan.Inheritance1.Animal;

public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    // Getter and Setter methods for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter and Setter methods for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}