package main.java.PotoracMihai.task6_19_07_24.HomeWorkTask6;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

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

    public void makeSound() {
        System.out.println("The animal makes sound:" + getSound());
    }

    public void printAnimalInfo() {
        System.out.println("Name: " + getName() + " Age: " + getAge() + " Sound: " + getSound());
    }
}
