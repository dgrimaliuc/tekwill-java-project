package DenisGrimaliuc.lection2207.overriding;

public class Cat extends Animal2 {
    String breed;

    public Cat(String name, int age, String color, String sound, String breed) {
        super(name, age, color, sound);
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
    }
}
