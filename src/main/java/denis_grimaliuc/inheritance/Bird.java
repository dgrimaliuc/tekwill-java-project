package main.java.denis_grimaliuc.inheritance;

public class Bird extends Animal {
    private String species;
    private double wingspan;

    public Bird(String name, int age, String type, String sound, String species, double wingspan) {
        super(name, age, type, sound);
        this.species = species;
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes sound: " + sound);
    }

    @Override
    public String toString() {
        return "Bird {" +
                "species='" + species + '\'' +
                ", wingspan=" + wingspan +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
