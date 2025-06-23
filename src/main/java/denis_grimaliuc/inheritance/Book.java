package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.Printable;

public class Book implements Printable {

    public String author;
    public String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
