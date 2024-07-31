package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.overriding;

public class Cat extends Animal {
    String breed;

    public Cat(String name, int age, String color, String sound) {
        super(name, age, color, sound);
        this.breed = breed;
    }

    public void printinfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
    }

}
