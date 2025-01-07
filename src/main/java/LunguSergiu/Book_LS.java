package main.java.LunguSergiu;

public class Book_LS {
    String titleBook;
    String authorBook;
    String year;
    String price;

    Book_LS(String tBook, String aBook, String y, String p) {
        titleBook = tBook;
        authorBook = aBook;
        year = y;
        price = p;
    }

    public void printInfo() {
        System.out.println("Title Book: " + titleBook);
        System.out.println("Author Book: " + authorBook);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

