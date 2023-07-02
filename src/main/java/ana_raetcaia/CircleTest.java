package ana_raetcaia;

import ana_raetcaia.task_six.Shape;

public class CircleTest {
    public static void main (String[]args) {
        Shape circleObj = new Circle(7);
        System.out.println("Area of circle: " + circleObj.calculateArea());
    }
}
