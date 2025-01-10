package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

/*
Proiectați o subclasă numită „Cat” care moștenește de la „Animal” și include variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */
public class Cat extends Animal {
    private String bread;
    private double weight;

    Cat(String name, int age, String sound, String bread, double weight) {
        super(name, age, sound);
        this.bread = bread;
        this.weight = weight;
    }
    public void print() {
        super.print(); // Adica printeaza mai intii printurile din prima clasa Animal
        System.out.println("Bread: " + bread);
        System.out.println("Weight: " + weight);
    }
    public void animalSound() {
        System.out.println(super.sound + " " + super.sound); // Primul print din main va face Meow Meow
    }
}
