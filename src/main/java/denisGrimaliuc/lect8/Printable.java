package main.java.denisGrimaliuc.lect8;

public interface Printable extends Comparable {

    public int a = 1;


    default void print() {
        System.out.println("1231223");
    }
}
