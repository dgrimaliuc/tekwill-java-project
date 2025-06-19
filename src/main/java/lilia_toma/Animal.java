package main.java.lilia_toma;

//Defineste o clasa numita Animal cu variabile de instanta cum ar fi nume, tip, varsta si sunet.
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
