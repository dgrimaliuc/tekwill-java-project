package IngaTitchiev.HW2207;

public class Book implements Printable {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + "\nAuthor: " + author + "\nPrice: " + price+" Lei";
    }
}

