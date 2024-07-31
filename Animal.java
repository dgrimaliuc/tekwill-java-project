package IgorTabirta.Les_July19.Inheritance.HW;

public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sound);
    }
}
