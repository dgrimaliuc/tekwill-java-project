package IngaTitchiev._HW_17_07;

public class Animals {
    private String name;
    private String type;
    private int age;
    private String sound;

   public Animals(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

     public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Ages: " + age);
    }

}
