package serghei_condrasov.interfaces;

/*Interfaces
Create a Printable interface with print() method.
Make an override toString() and format the output. print method should have default implementation which will use toString() and sout to print object content*/

public interface Printable {
    default void print() {
        System.out.println(toString());
    }
}
