package main.java.denis_grimaliuc;


/**
 * Creează o clasă numită Book cu variabile de instanță precum titlu, autor, an și preț.
 */
public class Book {

    String title;
    String author;
    int year;
    double price;

    Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book: " +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                "\n";
    }
}
