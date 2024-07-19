package IgorTabirta.Obj;

public class Book {
    String title = "Red Hat";
    String author = "Gogol";
    int year = 1898;
    double price = 2.16;

    public void printInfo() {
        System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Year: " + year + "\n" + "Price: " + price);
    }
}
