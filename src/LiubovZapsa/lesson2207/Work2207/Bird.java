package LiubovZapsa.lesson2207.Work2207;

public class Bird extends Animal2 {


    public Bird(String name, int age, String type, String sound) {
        super(name, age, type, sound);
    }

    public void makeSound() {
        System.out.println("Chiric chirik!");
    }
}
