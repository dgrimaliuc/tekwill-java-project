package ana_raetcaia;

import ana_raetcaia.task_six.Rectangle;
import ana_raetcaia.task_six.Shape;

public class RectangleTest {
    public static void main(String[]args){
        Shape rectangleObj = new Rectangle(8,10);
        System.out.println("Area of rectangle: " + rectangleObj.calculateArea());
    }

}
