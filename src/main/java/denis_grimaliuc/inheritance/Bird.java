package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.IAnimal;

public class Bird implements IAnimal {
    private String species;


    public Bird(String name, int age, String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Bird eats seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes sound chirp");
    }

    @Override
    public String toString() {
        return "Bird {" +
                "species='" + species + '\'' +
                '}';
    }
}
