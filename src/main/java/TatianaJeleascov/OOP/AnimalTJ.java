package main.java.TatianaJeleascov.OOP;

public class AnimalTJ  {
    private String nameAnimal;
    private int ageAnimal;
    private String soundAnimal;

    public AnimalTJ(String nameAnimal, int ageAnimal, String soundAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.soundAnimal = soundAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getSoundAnimal() {
        return soundAnimal;
    }

    public void setSoundAnimal(String soundAnimal) {
        this.soundAnimal = soundAnimal;
    }
}
