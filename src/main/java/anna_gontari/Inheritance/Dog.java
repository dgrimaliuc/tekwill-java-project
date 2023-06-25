package anna_gontari.Inheritance;

import java.util.ArrayList;

//Implement a class called "Animal" with instance variables for name, age, and sound.
// Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables
// such as breed and weight, create constructors to initialize all variables.
public class Dog extends Animal{
    String breed;
    int weight;
    Dog(String breed, int weight) {
        super("Leo", 3, "roar");
        this.breed = breed;
        this.weight = weight;
    }
    Dog(String breed, int weight, String name, int age, String sound) {
        super (age, sound);
        this.breed = breed;
        this.weight = weight;




    }



}

