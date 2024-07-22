package IngaTitchiev.HW1907;

public class Animals {
    private String name;
   private int age;
    private String sound;

    public Animals(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + sound);
    }

}

