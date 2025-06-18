package main.java.nicolae_luchian.ineritance;

public class Animal {
    String name;
    int age;
    String type;
    String sound;


    public Animal(String name, int age, String type, String sound){
        this.name = name;
        this.age = age;
        this.type = type;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(sound);
    }
}
