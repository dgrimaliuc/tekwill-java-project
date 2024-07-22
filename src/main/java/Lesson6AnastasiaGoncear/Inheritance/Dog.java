package Lesson6AnastasiaGoncear.Inheritance;

public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed=breed;
        this.weight=weight;
        }
    public void printInfo(){
        System.out.println("Name "+ getName());
        System.out.println("Age " + getAge());
        System.out.println("Sound " + getSound());
        System.out.println("Breed "+breed);
        System.out.println("Weight "+weight);
    }
}
