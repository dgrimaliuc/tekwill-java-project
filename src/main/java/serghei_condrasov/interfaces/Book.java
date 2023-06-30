package serghei_condrasov.interfaces;

//Create classes Book and Magazine that implement the Printable interface
// and have their own unique fields and methods for printing.
//For example, Book has name,author,price.

public class Book implements Printable{
    private String nameBook;
    private String author;
    private double price;

    public Book(String nameBook, String author, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}