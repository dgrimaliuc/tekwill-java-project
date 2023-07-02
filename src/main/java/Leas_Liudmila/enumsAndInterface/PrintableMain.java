package Leas_Liudmila.enumsAndInterface;

import java.util.ArrayList;

public class PrintableMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Wager", "David Grann", 25.55);
        Book book2 = new Book("Look for Me There", "Luke Russert", 24.99);
        Magazine magazine1 = new Magazine("Vogue", "350 Madison Ave New York NY 10017", "(212) 880-8800");
        Magazine magazine2 = new Magazine("Time", "1095 Sixth Avenue, New York, NY 10036", "(515) 284-3000");

        Printable[] printables = new Printable[]{book1, book2, magazine1, magazine2};

        for (Printable prn : printables) {
            prn.print();
        }

    }
}
