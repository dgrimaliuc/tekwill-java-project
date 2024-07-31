package IvanTrembaci.src.main.java.ChirilBortnicov.Lesson2407;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee full = new FullTimeEmployee("John", 2000);
        full.displayInfo();
        Employee part = new PartTimeEmployee("Chiril", 12, 8);
        part.displayInfo();

        ArrayList<Printable> BooMag = new ArrayList<>();
        BooMag.add(new Book("Robin Hood", "Sally M. Stockton", 60));
        BooMag.add(new Book("Dracula", "Bram Stoker", 50));
        BooMag.add(new Book("Normal People","Sally Rooney", 80 ));
        BooMag.add(new Magazine("Time", "Meredith"));
        BooMag.add(new Magazine("Majesty", "Cliff Moulder"));
        for (Printable BM : BooMag){
            BM.print();
        }

    }
}
