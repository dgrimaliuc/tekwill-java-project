package main.java.liliana_stavita;

public class Animal {

    String name;
    int age;
    String type;
    String sound;

    Animal(String name, int age, String type, String sound) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.sound = sound;
    }

    void printInfo(){
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age);
        System.out.println("Animal type: " + type);
        System.out.println("Animal sound: " + sound);
        System.out.println("------------------------");
    }

    void makeSound() {
        System.out.println(name + " the " + type + " says: " + sound);
    }


}