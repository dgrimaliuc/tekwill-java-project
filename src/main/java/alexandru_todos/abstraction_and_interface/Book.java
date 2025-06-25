package main.java.alexandru_todos.abstraction_and_interface;

public class Book implements Printable {
    public String bookName;
    public String bookAuthor;
    public double bookPrice;

    public Book(String bookName, String bookAuthor, double bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book: " + bookName + " by " + bookAuthor + " - " + bookPrice + "$";
    }
}
