package main.java.LiliaRosca.polymorphism_abstraction_08_01;

// supraincarcă metoda show pentru a afișa un int, un double și un String.
public class Display {
    public void show(int a) {
        //a = 1;
        System.out.println("Integer number - " + a);
    }

    public void show(double a) {
        //a = 1.1;
        System.out.println("Double number - " + a);
    }

    public void show(String a) {
        //a = "ABC";
        System.out.println("String - " + a);
    }
}
