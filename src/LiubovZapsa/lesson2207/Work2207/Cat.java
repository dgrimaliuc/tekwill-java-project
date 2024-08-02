package LiubovZapsa.lesson2207.Work2207;

public class Cat extends Animal2 {
    String breed;

    public Cat(String name, int age, String type, String sound, String breed) {
        super(name, age, type, sound);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Meau meau!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + getBreed());


    }
}
