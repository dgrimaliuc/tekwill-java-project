package anna_gontari.Inheritance;

public class Animal {
    //Implement a class called "Animal" with instance variables for name, age, and sound.
    // Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables
    // such as breed and weight, create constructors to initialize all variables.
    String name;
    int age;
    String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public Animal(int age, String sound) {
    }
}
