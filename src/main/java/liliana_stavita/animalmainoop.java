package main.java.liliana_stavita;

public class animalmainoop {


    public static void main(String[] args) {

        Animal dog = new Animal("Musika", 5, "Dog", "Bark");
        Animal cat = new Animal("Leo", 3, "Cat", "Meow");
        Animal bird = new Animal("Kesha", 4, "Bird", "Meow");


        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

    }

}