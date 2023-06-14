package Leas_Liudmila;

public class Main {
    public static void main(String[] args) {
        float a = 150;
        float b = 255;
        float c = 76;
        float d = 13;
        System.out.println("Calculate the value using the following formula: ((a+b)-c)*c/d.");
        System.out.println(String.format("If a = %.2f, b = %.2f, c = %.2f, d = %.2f", a, b, c, d));
        System.out.printf("((%.2f + %.2f) - %.2f) * %.2f / %.2f", a, b, c, c, d);
        System.out.print(" = " + ((a + b) - c) * c / d);

    }
}
