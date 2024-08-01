package LiubovZapsa.lesson2207.Overriding;

public class Dog extends Animal2 {
    private String breed;
    private double wieght;

    public Dog(String name, int age, String type, String sound, String breed, double weight) {
        super(name, age, type, sound);
        this.breed = breed;
        this.wieght = weight;
    }

    public void makeSound() {
        System.out.println("Gaf gaf");
    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + wieght);

    }


}




