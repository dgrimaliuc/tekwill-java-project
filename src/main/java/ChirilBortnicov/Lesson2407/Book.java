package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

public class Book implements Printable{

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    private String name;
    private String author;
    private double price;


    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
