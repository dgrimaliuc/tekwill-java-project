package main.java.PotoracMihai.lesson22_07_27.Polymorphism.overriding;

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

    public void printinfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + getBreed());
        System.out.println("Weight: " + getWeight());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
    }
}
