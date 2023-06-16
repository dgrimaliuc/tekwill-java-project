package alina_gutsul.Inheritance;

public class Animal {
    private String name;
    private int age;
    private String sound;

    // Constructor
    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSound() {
        return sound;
    }
}

class Dog extends Animal {
    private String breed;
    private double weight;

    // Constructor
    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    // Getter methods
    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }
}


