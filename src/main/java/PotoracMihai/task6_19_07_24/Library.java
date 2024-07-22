package main.java.PotoracMihai.task6_19_07_24;

import java.util.List;

public class Library {
    private String name;
    private String location;

    private List<String> books;

    public Library(String name, String location, String[] books) {
        this.name = name;
        this.location = location;
        this.books = List.of(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    //Create methods getBooks, addBook, arendBook.
    public void addBook(String book) {
        books.add(book);
    }

    public void arendBook(String book) {
        books.remove(book);
    }
}
