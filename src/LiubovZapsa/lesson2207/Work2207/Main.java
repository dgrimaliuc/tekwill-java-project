package LiubovZapsa.lesson2207.Work2207;

public class Main {

    public static void main(String[] args) {
        Animal2 someAnimal = new Animal2("Some animal", 1, "Grey", "sound");
        Animal2 dog = new Dog("Rex", 3, "Brown", "Gaf", "dog", 3.3);
        Animal2 bird = new Bird("Chip", 4, "green", "Chirik");
        Animal2 cat = new Cat("Pups", 2, "black", "Meau", "cat");
        someAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}










