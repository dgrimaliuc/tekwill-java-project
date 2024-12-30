package main.java.IonErm.Old;

public class Fruit {
    String name;
    String color;
    double calories;

    Fruit(String name, String color, double calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    public void printInfo() {
        System.out.println("Fruit name " + name);
        System.out.println("Fruit color " + color);
        System.out.println("Calories  " + calories);
        System.out.println();
    }
}
