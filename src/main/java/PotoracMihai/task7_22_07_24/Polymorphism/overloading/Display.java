package main.java.PotoracMihai.task7_22_07_24.Polymorphism.overloading;

public class Display {
    //Create a Display class and overload the show method to display an integer, a double, and a String.

    public static void main(String[] args) {
        Display display = new Display();
        System.out.println(display.show(10));
        System.out.println(display.show(10.5));
        System.out.println(display.show("Hello World"));
    }

    public int show(int a) {
        return a;
    }

    public double show(double a) {
        return a;

    }

    public String show(String a) {
        return a;
    }


}
