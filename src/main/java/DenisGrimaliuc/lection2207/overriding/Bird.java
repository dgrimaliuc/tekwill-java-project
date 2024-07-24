package DenisGrimaliuc.lection2207.overriding;

public class Bird extends Animal2 {
    public Bird(String name, int age, String color, String sound) {
        super(name, age, color, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirik Chirik");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
    }


}
