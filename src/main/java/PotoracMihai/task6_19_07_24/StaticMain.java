package main.java.PotoracMihai.task6_19_07_24;

public class StaticMain {

    static int a = 5;

    public static void main(String[] args) {
        System.out.println("a= " + a);
        StaticMain ab = new StaticMain();
        StaticMain ab2 = new StaticMain();
        ab2.a = 10;
        System.out.println("a= " + ab.a);
        System.out.println("a= " + ab2.a);
    }
}
