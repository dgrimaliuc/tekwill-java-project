package IngaTitchiev.HW2207;

public interface Printable {
    default void print() {
        System.out.println(this.toString());
    }
}

