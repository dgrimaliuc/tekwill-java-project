package main.java.IonErm;

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

    public void printInfo() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price + " $");
    }
}
