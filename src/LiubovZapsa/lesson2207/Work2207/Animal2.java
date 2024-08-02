package LiubovZapsa.lesson2207.Work2207;

public class Animal2 {
    private String name;
    private int age;
    private String type;
    private String sound;

    public Animal2(String name, int age, String type, String sound) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal sound!");
    }
}

