package VictorMurashev.homework_20240720.task3;

public class Animal {
    private String name;
    private int age;
    private String sound;

    //Constructor
    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    //Getters and setters (generated)

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

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }
}
