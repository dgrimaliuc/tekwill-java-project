package alexandr_samohvalov.Interfaces;

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
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book: " + name + ", Author: " + author + ", Price: $" + price;
    }
}
