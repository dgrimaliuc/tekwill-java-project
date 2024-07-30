package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.overriding;

import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Printable;

public abstract class Animal implements Printable {
    private String name;
    private int age;
    private String color;

    private String sound;

    public Animal(String name, int age, String color, String sound) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSound() {
        return sound;
    }

    public abstract void makeSound();
}
