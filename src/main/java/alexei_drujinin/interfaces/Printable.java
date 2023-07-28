package alexei_drujinin.interfaces;

public interface Printable {
    default void print () {
        System.out.println(toString());
    }
}
