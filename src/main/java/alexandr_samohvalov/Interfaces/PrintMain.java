package alexandr_samohvalov.Interfaces;

public class PrintMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java Prograamming", "John Smith", 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 29.99);
        Magazine magazine1 = new Magazine("National Geographic", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "Time USA, LLC");

        Printable[] printableItems = {book1, book2, magazine1, magazine2};

        for (Printable item : printableItems) {
            item.print();
        }
    }
}
