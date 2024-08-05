package LiubovZapsa.Homework170704;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Murca", "cat", 5, "Meau-meau");
        Animal animal2 = new Animal("Sharic", "dog", 3, "Gaf-gaf");
        Animal animal3 = new Animal("Alenca", "cow", 6, "Muu-muu");

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal1.displayInfo();
        animal2.displayInfo();
        animal3.displayInfo();

    }
}

