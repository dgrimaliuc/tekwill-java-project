package VictorMurashev.homework_20240718;

class Animal {
    // Instance variables
    private String name;
    private String type;
    private int age;
    private String sound;

    // Parameterized constructor
    public Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("===Animal making sound====");
        System.out.println(sound + "\n");
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("===Information about Animal====");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("\n");
    }
}
