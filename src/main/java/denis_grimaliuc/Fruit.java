package main.java.denis_grimaliuc;


// Creează o clasă numită Fruit cu variabile de instanță precum nume, culoare și calorii.
public class Fruit {
    public String name;
    String color;
    int calories;

    public Fruit(String name, String color, int calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    public void printInfo() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Calories: " + calories);
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "Fruit {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", calories=" + calories +
                '}';
    }
}
