package ChirilBortnicov.Inheritance;

public class Rectalge extends Shape{

    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectalge(String color, String color2, String color3, double width, double height) {
        super(color, color2, color3);
        this.width = width;
        this.height = height;


    }

    @Override
    public String toString() {
        return super.toString() + "Rectalge{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    public void printInfo(){
        System.out.println("Color: "+getColor());
        System.out.println("Color: "+getColor2());
        System.out.println("Color: "+getColor3());
        System.out.println("Wight: "+getWidth());
        System.out.println("Height: "+getHeight());
    }
}
