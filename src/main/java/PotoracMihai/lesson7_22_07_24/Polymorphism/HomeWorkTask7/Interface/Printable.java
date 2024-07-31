package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7.Interface;

public interface Printable {
    default void print() {
        System.out.println(this.toString());
    }
}
