package anna_gontari.Inheritance;

//Implement a class called "Animal" with instance variables for name, age, and sound.
// Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables
// such as breed and weight, create constructors to initialize all variables.
public class Dog extends Animal {
    private String breed;
    private int weight;
    Dog(String breed, String name, int age, int weight, String sound) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }
    public Dog(String name, int age, String sound, String breed, int weight) {
        super(name, age, sound);
        setBreed(breed);
        setWeight(weight);
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}