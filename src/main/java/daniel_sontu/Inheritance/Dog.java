package main.java.daniel_sontu.Inheritance;

public class Dog extends main.java.daniel_sontu.Inheritance.Animal {
    public String breed;
    public double weight;

    public Dog(String name, int age, String type, String sound, String breed, double weight) {
        super(name, age, type, sound);
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +   // these must be protected in Animal
                ", age=" + age +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
