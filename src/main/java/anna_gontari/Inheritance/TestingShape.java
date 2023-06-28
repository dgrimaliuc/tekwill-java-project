package anna_gontari.Inheritance;

public class TestingShape {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle("Black",30, 20);
        System.out.println(myRectangle.getColor()+ " : " + myRectangle.getWidth() + " : " + myRectangle.getHeight());
    }
}
