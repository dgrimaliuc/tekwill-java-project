package TatianaJeleascov;

public class Animal {
    private String name;
    private String type;
    private int age;
    private String sound;

    public Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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


    public void makeSound() {
        System.out.println("The " + type + " named " + name + " says '" + sound + "'");
    }
  
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
    }

}
