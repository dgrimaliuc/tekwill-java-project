package main.java.nicolae_luchian;

public class Book {
    private String author;
    private String title;
    private double price;
    int year;

    public Book(String author, String title, double price, int year) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public void printBookInfo(){
        System.out.println("The book is called " + title + " and it is written by " + author);
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + ", price=" + price + ", year=" + year + '}';
    }
}
