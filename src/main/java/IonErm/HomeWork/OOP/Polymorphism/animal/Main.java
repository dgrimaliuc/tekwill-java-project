package main.java.IonErm.HomeWork.OOP.Polymorphism.animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal animal = new Animal();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        animal.makeSound();
    }
}
