package alexandr_samohvalov.Abstract_Classes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

}
