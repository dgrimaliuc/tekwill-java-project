package main.java.denisGrimaliuc.incapsulation;


// Creează o clasă numită Book cu variabile de instanță precum titlu, autor, an și preț.
public class Book {
    String title;
    String author;
    int price;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

}
