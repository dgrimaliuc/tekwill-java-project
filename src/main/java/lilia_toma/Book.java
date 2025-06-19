package main.java.lilia_toma;

/**
 * ex.1 Creeaza o clasa numita Book cu variabile de instanta
 * precum titlul, autor, an si pret.
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

    //sau prinInfo folosim
    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println();
    }


    //sau toString din Menu-Code-Generate-toString

    @Override
    public String toString() {
        return "Book:" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                "\n";
    }
}
