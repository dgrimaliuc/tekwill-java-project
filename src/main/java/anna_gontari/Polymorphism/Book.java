package anna_gontari.Polymorphism;

public class Book implements Printable{
    public String name;
    public String author;
    public int price;

    public Book (String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Name of the book: " + name + " / " + "Author's name: " + author + " / " + "The book's price: " + price;
    }

}

