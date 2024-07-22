package IngaTitchiev.HW1907;
public class Dog extends Animals {
    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound); // Call the constructor of the superclass (Animal)
        this.breed = breed;
        this.weight = weight;
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

    @Override
    public void printDetails() {
        super.printDetails(); // Call the superclass method to print Animal details
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight+" Kg");
    }

    public static void main(String[] args) {
                Animals animal = new Animals("Leu", 4, "HRR");
        animal.printDetails();

        Dog dog = new Dog("Saxa", 3, "Gavv", "Black Retriever", 30.5);
        dog.printDetails();
    }
}

