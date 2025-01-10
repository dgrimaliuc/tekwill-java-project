package main.java.iuliaNamolovan.IN_HM6;

public class Book {
    String Title;
    String Author;
    int Year;

    Book(String t, String a, int y) {
        Title = t;
        Author = a;
        Year = y;
    }

    public void printInfo() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Year: " + Year);
    }
}
