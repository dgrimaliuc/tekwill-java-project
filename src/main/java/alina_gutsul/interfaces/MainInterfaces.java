package alina_gutsul.interfaces;

interface Printable {
    void print();
}

class Book implements Printable {
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
        return String.format("Book: %s\nAuthor: %s\nPrice: $%.2f", name, author, price);
    }
}

class Magazine implements Printable {
    private String name;
    private String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Magazine: %s\nOwner: %s", name, owner);
    }
}

public class MainInterfaces {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        printableItems[1] = new Magazine("National Geographic", "National Geographic Society");
        printableItems[2] = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);
        printableItems[3] = new Magazine("Time", "Time Magazine");

        for (Printable item : printableItems) {
            item.print();
            System.out.println();
        }
    }
}
