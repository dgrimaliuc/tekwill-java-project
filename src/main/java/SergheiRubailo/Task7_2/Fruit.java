package SergheiRubailo.Task7_2;

public class Fruit {

    String name;
    String color;
    int cal;

    public Fruit(String name, String color, int cal) {
        this.name = name;
        this.color = color;
        this.cal = cal;
    }

    @Override
    public String toString() {
        return "Fruit name: " + name + " Color: " + color + " Callories: " + cal;
    }
}
