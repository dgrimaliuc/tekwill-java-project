package DenisGrimaliuc.task1907.inheritance;


/*

 Implement a class called "Animal" with instance variables for name, age, type and sound.
 Create a subclass called "Dog" that inherits from "Animal"
  and includes additional instance variables such as breed and weight.
 */
public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String name, int age, String color, String sound, String breed, double weight) {
        super(name, age, color, sound);
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Type: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
    }
}
