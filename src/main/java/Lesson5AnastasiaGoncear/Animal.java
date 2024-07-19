package Lesson5AnastasiaGoncear;
/*Define a class called Animal:
	•	Add instance variables: name, type (cat, dog, caw), age, and sound (example: meau, gav-gav, muuu).
Create Constructors for the Animal Class:
	•	Create a parameterized constructor that initializes the instance variables with the provided values.
Implement Methods for the Animal Class:
	•	Create a method makeSound() that prints the sound of the animal
	•	Create a method displayInfo() that prints the name, type, and age of the animal.
*/

public class Animal {
    String name;
    String type;
    int age;
    String sound;

    Animal(String name,    String type,   int age,    String sound){
        this.name=name;
        this.type=type;
        this.age=age;
        this.sound=sound;

    }
    public void makeSound() {
        System.out.println(sound);
    }
    public void displayInfo() {
        System.out.println(name + " " + type + " " + age + " " + sound);
    }

}
