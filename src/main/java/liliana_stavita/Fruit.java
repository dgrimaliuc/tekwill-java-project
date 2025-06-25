package main.java.liliana_stavita;

public class Fruit {
    String name;

    String color;

    int calories;

    Fruit(String name, String color, int Calories) {
        this.name =name;
        this.color =color;
        this.calories =calories;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", calories=" + calories +
                '}';
    }

    void printInfo(){
        System.out.println("Fruit Name" + name);
        System.out.println("Color" + color);
        System.out.println("Calories" + calories);
        System.out.println("--------------------------");

        }
                }
