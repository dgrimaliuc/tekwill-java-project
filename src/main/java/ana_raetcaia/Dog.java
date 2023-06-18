package ana_raetcaia;


import java.util.ArrayList;

public class Dog extends Animal {
    String breed;
    int weight;

    Dog(String breed, int weight, String name, int age, String sound) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog dogObj = new Dog("Pincher", 3400, "Archie", 12, "Gav-gav");

        System.out.println("Information about dog: ");
        System.out.println("Breed: " + dogObj.breed);
        System.out.println("Weight: " + dogObj.weight);
        System.out.println("Name: " + dogObj.name);
        System.out.println("Age: " + dogObj.age);
        System.out.println("Sound: " + dogObj.sound);

        //Create List of Dog with some obejcts inside, print all objects info in a foreach loop.
        ArrayList<String> dog = new ArrayList<>();
        dog.add("Rottweilers");
        dog.add("Poodles");
        dog.add("GoldenRetrivers");
        for (String x : dog) {
            System.out.println(x);
        }


    }



    }
