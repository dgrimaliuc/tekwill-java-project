package SergheiRubailo.Task8;

public class Book {

    String title;
    String author;
    double price;
    String isbn;

    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", ISBN: " + isbn);
    }

    public void applyDiscount(double percentage) {
        price = price * (1 - percentage / 100);
        System.out.println("New price: " + price);
    }
}
