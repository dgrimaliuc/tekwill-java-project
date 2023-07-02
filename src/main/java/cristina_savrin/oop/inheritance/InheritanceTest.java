package cristina_savrin.oop.inheritance;

import java.util.ArrayList;

public class InheritanceTest {

    public static void main(String[] args) {

        Dog labrador = new Dog("Doggy", "Woof!", 7, "Labrador Retriever", 30);
        System.out.println("\nThe dog " + labrador.getName() + " of breed " + labrador.getBreed() + " barks: " + labrador.getSound() +
                " " + "and weights: " + labrador.getWeight() + "kg");

        Manager manager = new Manager(359, "Linda Cole", 3000, "DevOps", 5);
        System.out.println("\nManager: " + manager.getId() + " " + manager.getName() + " " + manager.getSalary() + "$" + ", Department: "
                + manager.getDepartment() + ", number of employees managed: " + manager.getSpanOfControl());
        manager.setSpanOfControl(10);
        manager.setSalary(4000);
        System.out.println("Manager: " + manager.getId() + " " + manager.getName() + " " + manager.getSalary() + "$" + ", Department: "
                + manager.getDepartment() + ", number of employees managed: " + manager.getSpanOfControl());

        Rectangle rectangle = new Rectangle("blue", 4, 5);
        System.out.println("\nThe created rectangle is " + rectangle.getColor() + ", has width: " + rectangle.getWidth() + " and height: "
                + rectangle.getHeight());
        rectangle.setColor("green");
        System.out.println("The modified rectangle is " + rectangle.getColor() + ", has width: " + rectangle.getWidth() + " and height: "
                + rectangle.getHeight());

        // 1. Create List of Dog with some objects inside, print all objects info in a foreach loop.
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog poodle = new Dog("Alfa", "Gruff!", 5, "Poodle", 20);
        Dog husky = new Dog("Beta", "Ruff!", 8, "Siberian Husky", 25);
        Dog bulldog = new Dog("Gamma", "Af!", 10, "Bulldog", 18);

        dogs.add(labrador);
        dogs.add(poodle);
        dogs.add(husky);
        dogs.add(bulldog);

        System.out.println("\nOur dogs: ");
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " - " + dog.getBreed() + " " + dog.getAge() + " years, " + dog.getWeight() + " kg, " + dog.getSound());
        }
    }
}
