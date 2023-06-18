package ana_raetcaia;

public class Animal {
    //1. Implement a class called "Animal" with instance variables for name, age, and sound.
    // Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables
    // such as breed and weight, create constructors to initialize all variables.
    private String name;
    private int age;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;


    }
}
