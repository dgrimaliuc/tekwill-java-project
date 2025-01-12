package main.java.denisGrimaliuc.lect8;

public class Dog extends Animal {
    Dog(String name, int age, String sound) {
        super(name, age, sound);
    }

    public void animalSound() {
        System.out.println(super.sound + " " + super.sound);
    }
}
