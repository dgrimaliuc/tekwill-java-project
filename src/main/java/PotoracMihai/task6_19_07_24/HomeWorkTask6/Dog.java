package main.java.PotoracMihai.task6_19_07_24.HomeWorkTask6;

public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;

    }
}
