package VictorMurashev.homework_20240720.task3;

public class Dog extends Animal{
    private String breed;
    private double weight;

    //Constructor
    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    //Getters and setters


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

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sound='" + getSound() + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
