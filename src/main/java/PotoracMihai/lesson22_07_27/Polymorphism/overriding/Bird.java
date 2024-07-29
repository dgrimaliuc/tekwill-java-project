package main.java.PotoracMihai.lesson22_07_27.Polymorphism.overriding;

public class Bird extends Animal {
    public Bird(String name, int age, String color, String sound) {
        super(name, age, color, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
    }


}
