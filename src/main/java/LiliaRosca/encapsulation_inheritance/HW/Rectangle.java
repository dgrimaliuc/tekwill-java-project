package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 2 - moștenește de la „Shape” + lățimea și înălțimea

public class Rectangle extends Shape {
    Integer width;
    Integer height;

    Rectangle(String colour, Boolean fillInStatus, Integer width, Integer height) {
        super(colour, fillInStatus);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "colour = '" + colour + '\'' +
                ", fillInStatus = " + fillInStatus +
                ", width = " + width +
                ", height = " + height +
                '}';
    }
}
