package roman_marcov;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {
        nameExist();
        uniqueWord();
    }

    //  1.  Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
    public static void nameExist() {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Vasya");
        hs.add("Roma");
        hs.add("Sahsa");
        hs.add("Kuzya");
        hs.add("Olea");
        hs.add("Anna");

        System.out.println("Initial HashSet " + hs);

        System.out.println("Element OLEA exists in the Set : " + hs.remove("Olea"));
    }

    //  2. Write a program that reads a sentence from the user and stores each unique word in a Set.
// Print the total number of unique words and display them in alphabetical order.
    public static void uniqueWord() {


    }
}
