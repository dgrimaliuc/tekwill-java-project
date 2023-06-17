package Leas_Liudmila.Inheritance;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Dog staff = new Dog("Graff", 14, "Gav", "stafford", 12.5f);

        System.out.println(staff.getName() + " " + staff.getAge() + " " + staff.getSound() + " " + staff.getBreed() + " " + staff.getWeight());

        //Create List of Dog with some objects inside, print all objects info in a foreach loop.

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(staff);

        Dog labrador = new Dog("Bessy", 5, "Gav", "labrador", 9.3f);
        dogs.add(labrador);

        Dog beagle = new Dog("Cooper", 9, "Gav", "beagle", 4.7f);
        dogs.add(beagle);

        Dog spaniel = new Dog("Bella", 2, "Gav", "spaniel", 2.5f);
        dogs.add(spaniel);

        Dog bulldog = new Dog("Charlie", 1, "Gav", "bulldog", 5.5f);
        dogs.add(bulldog);

        for (var doggy : dogs) {
            System.out.println(doggy.getName() + "\t | " + doggy.getAge() + "\t | " + doggy.getSound() + "\t | " + doggy.getBreed() + "\t | " + doggy.getWeight());
        }


    }
}
