package VictorMurashev.homework_20240720.task4;

public class Shape {
    private String color;

    //Constructor
    public Shape(String color) {
        this.color = color;
    }

    //Getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape {" +
                "color='" + color + '\'' +
                '}';
    }
}
