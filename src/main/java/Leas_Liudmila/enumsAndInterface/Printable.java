package Leas_Liudmila.enumsAndInterface;

//Create a Printable interface with print() method. Create classes Book and Magazine that implement the Printable interface
//and have their own unique fields and methods for printing. For example, Book has name,author,price. Magazine has name,
//street, owner. Make an override toString() and format the output. print method should have default implementation which will use toString() and sout to print object content.
//Create an array of Printable objects containing both books and magazines and call the print() method for each item.
public interface Printable {
    public default void print() {
        System.out.println(toString());

    }
}
