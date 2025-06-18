package main.java.nicolae_luchian.ineritance;

public class Dog extends Animal{

    String breed;
    Double weight;

    public Dog(String name, int age, String breed, Double weight, String type, String sound){
        super(name, age, "Dog", "Woof");
        this.breed = breed;
        this.weight = weight;
    }

    public void bark(){
        super.makeSound();
    }

}
