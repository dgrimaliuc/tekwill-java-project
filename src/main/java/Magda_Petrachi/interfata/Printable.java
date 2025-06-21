package main.java.Magda_Petrachi.interfata;

public interface Printable {
    default void print() {
        System.out.println(this);
    }
}
