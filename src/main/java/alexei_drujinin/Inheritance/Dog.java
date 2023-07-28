package alexei_drujinin.Inheritance;

public class Dog extends Animal {

    String breed;
    int weight;


    Dog(String breed, int weight, String name, int age, String sound) {
        super(name, age, sound);
        this.breed = breed;
        this.weight =weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
