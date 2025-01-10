package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

public class Dog extends Animal {
    Dog(String name, int age, String sound) {
        super(name, age, sound);
    }
    public void animalSound() {
        System.out.println(super.sound + " " + super.sound); // Primul print din main va face Gaw Gaw
    }
}
