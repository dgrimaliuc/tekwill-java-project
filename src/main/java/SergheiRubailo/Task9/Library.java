package SergheiRubailo.Task9;


/*Develop a class named "Library" with private instance variables for library name, location, and books.
Create methods getBooks, addBook, arendBook.*/

import java.util.ArrayList;

public class Library {

    private String name;
    private String location;
    private ArrayList<String> books;

    public Library(String name, String location, ArrayList<String> books) {
        this.name = name;
        this.location = location;
        this.books = books;
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

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }

    public void addBook(String book) {
        this.books.add(book);
    }

    public void arendBook(String book) {
        this.books.remove(book);
    }

}
