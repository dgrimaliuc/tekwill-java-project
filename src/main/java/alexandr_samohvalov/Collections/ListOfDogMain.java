package alexandr_samohvalov.Collections;

import alexandr_samohvalov.Inheritance.Animal;
import alexandr_samohvalov.Inheritance.Dog;

import java.util.ArrayList;
import java.util.List;
//Create List of Dog with some obejcts inside, print all objects info in a foreach loop.
public class ListOfDogMain {
    public static void main (String[] args) {
        List<Dog> dogList = new ArrayList<>();

        Dog dog1 = new Dog("Buddy", 3, "Woof", "Labrador", 25.5);
        Dog dog2 = new Dog("Max", 5, "Bark", "German Shepherd", 30.2);
        Dog dog3 = new Dog("Lucy", 2, "Woof", "Golden Retriever", 22.8);

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        for (Dog dog : dogList) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Age: " + dog.getAge());
            System.out.println("Sound: " + dog.getSound());
            System.out.println("Breed: " + dog.getBreed());
            System.out.println("Weight: " + dog.getWeight());
            System.out.println();
        }
    }

}
