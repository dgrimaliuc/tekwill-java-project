package IgorTabirta.Les_July19.Inheritance.HW;

public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;

    }

    public void printInfo() {
        super.printInfo();
        System.out.println(breed);
        System.out.println(weight);
    }
}
