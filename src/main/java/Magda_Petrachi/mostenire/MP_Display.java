package main.java.Magda_Petrachi.mostenire;


public class MP_Display {
    public static void show(int number) {
        System.out.println("Int number " + number);
    }

    public static void show(double number) {
        System.out.println("Double number " + number);
    }

    public static void show(String number) {
        System.out.println("String number " + number);
    }

    public static void main(String[] args) {
        show(42);
        show(3.14);
        show("Salut!");
    }

}
