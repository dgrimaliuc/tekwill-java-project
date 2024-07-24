package DenisGrimaliuc.lection2207.overriding;


/*

 Implement a class called "Animal" with instance variables for name, age, type and sound.
 Create a subclass called "Dog" that inherits from "Animal"
  and includes additional instance variables such as breed and weight.
 */
public class Dog extends Animal2 {
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

    @Override
    public void makeSound() {
        System.out.println("Wow Wow");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Type: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
    }
}
