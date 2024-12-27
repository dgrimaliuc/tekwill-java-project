package main.java.LiliaRosca.incapsulation_inheritance;

public class LR_Fruit {
    // Exercitii class 23.12 Ex 1
    String nume;
    String culoare;
    int calorii;

    LR_Fruit(String name, String color, int calories) {
        nume = name;
        culoare = color;
        calorii = calories;
    }

    public void printInfoF() {
        System.out.println("Name: " + nume);
        System.out.println("Color: " + culoare);
        System.out.println("Calories: " + calorii + "\n");
    }
}