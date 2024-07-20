package main.java.TatianaJeleascov.OOP;

public class Dog extends AnimalTJ{
    private String breedAnimal;
    private double weightAnimal;

    public Dog(String nameAnimal, int ageAnimal, String soundAnimal, String breedAnimal, double weightAnimal) {
        super(nameAnimal, ageAnimal, soundAnimal);
        this.breedAnimal = breedAnimal;
        this.weightAnimal = weightAnimal;
    }

    public double getWeightAnimal() {
        return weightAnimal;
    }

    public void setWeightAnimal(double weightAnimal) {
        this.weightAnimal = weightAnimal;
    }

    public String getBreedAnimal() {
        return breedAnimal;
    }

    public void setBreedAnimal(String breedAnimal) {
        this.breedAnimal = breedAnimal;
    }
}
