package LiubovZapsa.Lesson170702;

public class Fruit {
    String name;
    String color;
    int calories;

    public Fruit(String name, String color, int calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
    }

    public String toString() {
        return "Fruit name: " + name + "\n" + "color: " + color +
                "\n" + "calories: " + calories + "\n";
    }

}
