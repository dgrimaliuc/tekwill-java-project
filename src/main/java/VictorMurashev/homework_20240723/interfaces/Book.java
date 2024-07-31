package VictorMurashev.homework_20240723.interfaces;

public class Book implements Printable{
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
        return "Book: Name \'" + name + "\', Author: \'" + author + "\', Price: $" + price + "]";
    }
}
