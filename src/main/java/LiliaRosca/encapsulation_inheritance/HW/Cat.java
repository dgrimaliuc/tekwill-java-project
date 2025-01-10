package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 3 moștenește de la „Animal” + rasa și greutatea

public class Cat extends Animal {
    String breed;
    Double weight;

    Cat(String name, int age, String sound, String breed, Double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", sound = '" + sound + '\'' +
                ",  age / years = " + age +
                ", weight = " + weight +
                '}';
    }
}
