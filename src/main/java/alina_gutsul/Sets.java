package alina_gutsul;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Create a Set of strings and add some names to it.
        // Print the size of the Set and check if a specific name exists in the Set.
        Set<String> names = new HashSet<>();

        names.add("Alina");
        names.add("Oleg");
        names.add("Denis");
        names.add("Ann");

        System.out.println("Size of the set: " + names.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();

        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does not exist in the set.");
        }

        //Write a program that reads a sentence from the user and stores each unique word in a Set.
        // aPrint the total number of unique words and display them in alphabetical order.
        Set<String> uniqueWords = new TreeSet<>();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner2.nextLine();

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println("Total number of unique words: " + uniqueWords.size());

        System.out.println("Unique words in alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
