package Leas_Liudmila.Inheritance;

import java.util.ArrayList;

public class Dog extends Animal {
    private String breed;
    private float weight;

    public Dog(String name, int age, String sound, String breed, float weight) {
        super(name, age, sound);
        setBreed(breed);
        setWeight(weight);

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
