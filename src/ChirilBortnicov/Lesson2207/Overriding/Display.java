package ChirilBortnicov.Lesson2207.Overriding;

public class Display {
    public static void main(String[] args) {
        Display display = new Display();
        System.out.println(display.num(2));
        System.out.println(display.aDouble(22));
        System.out.println(display.str("String"));
    }
    public int num (Integer a){
        return a;
    }
    public double aDouble(double a){
        return a;
    }
    public String str(String a){
        return a;
    }
}
