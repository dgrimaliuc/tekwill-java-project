package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Cat extends Animal {
    public String race;
    public double weight;

    Cat(String name, int age, String sound, String race, double weight) {
        super(name, age, sound);
        this.race = race;
        this.weight = weight;
    }
}
