package serghei_condrasov.abstraction;

//Abstract Classes
// 1. Create two subclasses of Shape, such as "Rectangle" and "Circle",
// and implement the "calculateArea" method differently in each subclass.

public class Circle extends Shape{
    @Override
    public void calculateArea() {
        System.out.println("Circle = " + 10*3);
    }
}
