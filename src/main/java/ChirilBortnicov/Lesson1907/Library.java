package ChirilBortnicov.Lesson1907;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<String> books;

    Library(){
        books = new ArrayList<>();
    }
    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        this.books.add(book);
    }

    public void arendBook(String book){
        this.books.remove(book);
    }
}
