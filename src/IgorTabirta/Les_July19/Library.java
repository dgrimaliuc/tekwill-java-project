package IgorTabirta.Les_July19;

import java.util.List;

public class Library {
    private String libraryName;
    private String location;
    private List<String> books;

    public Library(String libraryName, String location, List<String> books) {
        this.libraryName = libraryName;
        this.location = location;
        this.books = books;
    }
}

