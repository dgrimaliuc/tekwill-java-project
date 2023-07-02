package serghei_condrasov.Inheritance;

public class Animal {

    /*Inheritance
    1. Implement a class called "Animal" with instance variables for name, age, and sound*/

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
}
