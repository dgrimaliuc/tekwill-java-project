package DenisGrimaliuc.lection2207.overriding;

public class Triangle implements IShape {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }


    /**
     * ½ (b × h)
     * This method calculates area of triangle
     *
     * @return double
     */
    @Override
    public double calculateArea() {
        return 0.5 * (side * height);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
