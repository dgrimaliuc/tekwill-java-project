package ana_raetcaia;

public class Circle extends Shape {
    private int radius;
 public Circle (int radius){
     this.radius = radius;


 }
    @Override
    public double calculateArea() {
        return Math.PI* Math.pow(radius, 2);
    }
}
