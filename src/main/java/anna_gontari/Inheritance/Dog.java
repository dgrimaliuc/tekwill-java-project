package anna_gontari.Inheritance;

//Implement a class called "Animal" with instance variables for name, age, and sound.
// Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables
// such as breed and weight, create constructors to initialize all variables.
public class Dog extends Animal {
    private String breed;
    private int weight;
    Dog(String name, int age, String sound, int weight, String breed) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}