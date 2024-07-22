package DenisGrimaliuc.lection2207.overriding;

import DenisGrimaliuc.lection2207.interfaces.Printable;

/*

 Implement a class called "Animal" with instance variables for name, age, type and sound.
 Create a subclass called "Dog" that inherits from "Animal"
  and includes additional instance variables such as breed and weight.
 */
public abstract class Animal2 implements Printable {
    private String name;
    private int age;
    private String color;
    private String sound;

    public Animal2(String name, int age, String color, String sound) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSound() {
        return sound;
    }


    public abstract void makeSound();
}
