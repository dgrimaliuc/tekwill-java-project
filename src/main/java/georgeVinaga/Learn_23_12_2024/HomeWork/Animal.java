package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

/*
Dezvoltați o clasă numită „Animal” cu variabile de instanță pentru nume, vârstă și sunet.
 */
public class Animal {
    String name;
    int age;
    String sound;

    Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + sound);
    }
}
