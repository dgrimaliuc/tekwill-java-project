package main.java.denis_grimaliuc;


// Definește o clasă numită Animal cu variabile de instanță cum ar fi nume, tip, vârstă și sunet.
public class Animal {
    String name;
    String type;
    int age;
    String sound;

    Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    void printInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + sound);
        System.out.println("-----------------------------");
    }

    void makeSound() {
        System.out.println(name + " the " + type + " says: " + sound);
    }
}
