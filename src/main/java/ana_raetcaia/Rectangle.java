package ana_raetcaia;

public class Rectangle extends Shape {
    private int l;
    private int w;

    public Rectangle(int l, int w) {
        this.w = w;
        this.l = l;
    }

    @Override
    public double calculateArea() {
        return l * w;
    }
}
