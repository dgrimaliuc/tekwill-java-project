package MarcencoAndrei;

// 1. Implement a class called “Animal” with instance variables for name, age, and sound. Create a subclass called “Dog” that inherits from “Animal”
// and includes additional instance variables such as breed and weight; create constructors to initialize all variables.
public class Dog extends Animal {
    String breed;
    double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog info = new Dog("Julienne", 7, "gav-gav", "Corgi", 17.19);
        System.out.println(info.name);
        System.out.println(info.age);
        System.out.println(info.sound);
        System.out.println(info.breed);
        System.out.println(info.weight);
    }

    public void printInfo() {

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
}
