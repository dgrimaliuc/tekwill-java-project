package main.java.PotoracMihai.lesson22_07_27.Polymorphism.HomeWorkTask7.Interface;

public interface Printable {
    default void print() {
        System.out.println(this.toString());
    }
}
