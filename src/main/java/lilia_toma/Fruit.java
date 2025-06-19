package main.java.lilia_toma;

//Creeaza o clasa numita Fruit cu variabile de instanta precum nume, culoare si calorii.
public class Fruit {
    String name;
    String color;
    int calories;

    Fruit(String name, String color, int calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    void printInfo() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Calories: " + calories);
        System.out.println("----------------------");
    }
}
