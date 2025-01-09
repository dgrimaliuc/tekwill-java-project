package main.java.denisGrimaliuc.lect8;


/*
Proiectați o subclasă numită „Cat” care moștenește de la „Animal” și include variabile de instanță suplimentare, cum ar fi rasa și greutatea.
 */
public class Cat extends Animal {
    private String breed;
    private double weight;

    Cat(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    public void print() {
        super.print();
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
    }


    @Override
    public void animalSound() {
        System.out.println(super.sound + " " + super.sound);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }
}
