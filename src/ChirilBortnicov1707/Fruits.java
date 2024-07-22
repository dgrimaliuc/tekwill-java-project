package ChirilBortnicov1707;

public class Fruits {
    //1. Create a class named Fruit with instance variables such as name, color and calories.
    String name;
    String color;
    double calories;

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", calories=" + calories +
                '}';
    }

    public Fruits(String name, String color, double calories){
        this.name = name;
        this.color = color;
        this.calories = calories;
    }
}
