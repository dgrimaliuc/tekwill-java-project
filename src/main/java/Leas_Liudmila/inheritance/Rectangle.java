package Leas_Liudmila.inheritance;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(String color, float width, float height){
        super(color);
        setWidth(width);
        setHeight(height);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
