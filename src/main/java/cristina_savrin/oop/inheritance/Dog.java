package cristina_savrin.oop.inheritance;

/**
 * Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables such as breed and weight,
 * create constructors to initialize all variables.
 */
public class Dog extends Animal {

    public String breed;
    public int weight;

    public Dog(String name, String sound, int age, String breed, int weight) {
        super(name, sound, age);
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
