package SergheiRubailo.Task8;

public class Animal {

    String name;
    String type;
    int age;
    String sound;

    public Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Type: " + type + ", Age: " + age);
    }
}
