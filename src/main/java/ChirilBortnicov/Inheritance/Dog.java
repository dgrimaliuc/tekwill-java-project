package ChirilBortnicov.Inheritance;

public class Dog extends Animal{

    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Name of dog: " + getName());
        System.out.println("Dog age: " + getAge());
        System.out.println("Sound: " + getSound());
        System.out.println("Breed of dog: " + getBreed());
        System.out.println("Dog weight: " + getWeight());
    }
}
