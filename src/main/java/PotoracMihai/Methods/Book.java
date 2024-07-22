package main.java.PotoracMihai.Methods;

public class Book {
    public String title;
    public String author;
    public double price;

    public int isbn;

    public Book(String title, String author, double price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("The book " + title + " by " + author + " costs " + price + " and has the ISBN " + isbn);
    }

    public void applyDiscount(double percentage) {
        double Newprice = price - price * percentage / 100;
        System.out.println("The new price is " + Newprice);
    }
}
