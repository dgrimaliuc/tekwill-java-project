package IgorTabirta.Obj;

public class Constr_fruit {
    String name;
    String color;
    double calories;

    public Constr_fruit(String name, String color, double calories) {
        this.name = name;
        this.color = color;
        this.calories = calories;
        System.out.println(this.name + "\n" + this.color + "\n" + this.calories);
    }
}
