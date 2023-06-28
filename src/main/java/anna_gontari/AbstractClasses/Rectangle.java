package anna_gontari.AbstractClasses;

public class Rectangle extends Shape{
    private int width;
    private int length;
    public Rectangle (int width, int length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return width * length;
    }
}
