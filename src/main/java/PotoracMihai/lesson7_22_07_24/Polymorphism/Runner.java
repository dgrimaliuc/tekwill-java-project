package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism;

import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7.Book;
import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7.Magazine;
import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.IShape;
import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Playable;
import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Printable;
import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.overriding.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    /*
     Create a Printable interface with print() method. Create classes Book and Magazine that implement the Printable interface and have their own unique fields and methods for printing. For example, Book has name,author,price. Magazine has name, owner. Make an override toString() and format the output.
      print method should have default implementation which will use toString() and sout to print object content. Create an array of Printable objects containing both books and magazines and call the print()
      method for each item.
     */
    public static void main(String[] args) {

        // Animal someAnimal = new Animal("Some Animal", 10, "black", "some sound");
        Animal cat = new Cat("Tom", 3, "Grey", "Meow");
        Animal bird = new Bird("Tweety", 1, "Yellow", "Chirp");
        Animal dog = new Dog("Rex", 5, "Brown", "Woof", "Labrador", 23.0);

        List<Animal> zoo = new ArrayList<>();
        Collections.addAll(zoo, cat, bird, dog);
        for (Animal animal : zoo) {
            animal.makeSound();
        }

        // someAnimal.makeSound();
        // cat.makeSound();
        // bird.makeSound();
        // dog.makeSound();
        System.out.println("");


        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(5, 10));
        shapes.add(new Circle(5));
        shapes.add(new Square(5));

        for (IShape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.calculateArea());
        }

        System.out.println("");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Truck());

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }

        System.out.println("");


        List<Playable> intruments = new ArrayList<>();
        intruments.add(new Guitar());
        intruments.add(new Piano());
        intruments.add(new Drums());
        for (Playable intrument : intruments) {
            intrument.play();
        }

        System.out.println("");

        List<Printable> printables = new ArrayList<>();
        printables.add(new Book("Book1", "Author1", 10.0));
        printables.add(new Magazine("Magazine1", "Owner1"));
        for (Printable printable : printables) {
            printable.print();
        }

    }
}
