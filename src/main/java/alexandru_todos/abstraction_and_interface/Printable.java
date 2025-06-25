package main.java.alexandru_todos.abstraction_and_interface;

// Create a Printable interface with the print() method.
// Create Book and Magazine classes that implement the Printable interface and have their own fields and methods
// for printing. For example, Book has name, author and price, and Magazine has name and owner.
// Override the toString() method and format the output. The print() method should have a default implementation
// that will use toString() and sout to print the contents of the object.
// Create an array of Printable objects containing both books and magazines and call the print() method for each object.
public interface Printable {
    default void print() {
        System.out.println(this);
    }
}
