package serghei_condrasov.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ObjectDog {

    //Create List of Dog with some objects inside, print all objects info in a foreach loop.

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Graph", 3,"Av av", "sheepdog", 25));
        dogs.add(new Dog("Charlie",2, "Gav gav", "labrador", 20));

     for (Dog dog : dogs) {
         System.out.println("Name: " + dog.getName() + ", Age - " + dog.getAge() + ", Sound - "+ dog.getSound() +
                            ", Breed - " + dog.getBreed() + ", Weight - " + dog.getWeight());
     }
    }
}
