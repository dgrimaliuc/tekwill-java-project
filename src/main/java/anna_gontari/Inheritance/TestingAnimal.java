package anna_gontari.Inheritance;

import java.util.ArrayList;

public class TestingAnimal {
    public static void main(String[] args) {
        Dog myDog = new Dog("dachshund", 3);
        System.out.println(myDog.breed + " : " + myDog.age + " : " + myDog.weight);

        //Create List of Dog with some objects inside, print all objects info in a foreach loop.

        ArrayList<String> dog = new ArrayList<>();
        dog.add("Chihuahua");
        dog.add("Labrador");
        dog.add("Spitz");
        dog.add("German Shepherd");
        for (String x : dog) {
            System.out.println(x);
        }
    }
}
