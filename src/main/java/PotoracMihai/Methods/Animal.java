package main.java.PotoracMihai.Methods;

public class Animal {
    public String name;
    public String type;
    public int age;
    public String sound;

    public Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("The " + type + " " + name + " says " + sound);
    }

    public void displayInfo() {
        System.out.println("The " + type + " " + name + " is " + age + " years old.");
    }
}
