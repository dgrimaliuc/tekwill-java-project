package cristina_savrin.oop.interfaces;

/**
 * Create a Printable interface with print() method. Create classes Book and Magazine that implement the Printable interface and have their own unique fields and methods for printing.
 * For example, Book has name,author,price. Magazine has name, street, owner.
 * Make an override toString() and format the output. print method should have default implementation which will use toString() and sout to print object content.
 * Create an array of Printable objects containing both books and magazines and call the print() method for each item.
 */
public class Magazine implements Printable {

    private String name, street, owner;

    public Magazine(String name, String street, String owner) {
        this.name = name;
        this.street = street;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" + name.toUpperCase() + ": " + street + ", " + owner + "}";
    }
}