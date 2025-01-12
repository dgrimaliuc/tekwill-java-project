package main.java.denisGrimaliuc.lect8;

public class Bird extends Animal {
    Bird(String name, int age, String sound) {
        super(name, age, sound);
    }

    public void animalSound() {
        System.out.println(super.sound + " " + super.sound);
    }
}
