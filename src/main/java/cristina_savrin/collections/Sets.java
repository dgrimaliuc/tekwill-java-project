package cristina_savrin.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Sets {

    public static void main(String[] args) {

        // 1. Create a Set of strings and add some names to it.
        // Print the size of the Set and check if a specific name exists in the Set.
        HashSet<String> names = new HashSet<>();
        names.add("Ion");
        names.add("Andrei");
        names.add("Valeriu");
        names.add("Anatolie");
        names.add("Dumitru");
        names.add("Anton");

        System.out.println("Size of the set: " + names.size());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for a specific name: ");
        String name = scanner.nextLine();

        if (names.contains(name)) {
            System.out.println(name + " was found in the set.");
        } else {
            System.out.println(name + " was not found in the set.");
        }

        // 2. Write a program that reads a sentence from the user and stores each unique word in a Set.
        // Print the total number of unique words and display them in alphabetical order.
        HashSet<String> uniqueWords = new HashSet<>();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nPlease enter a sentence: ");
        String sentence = scanner.nextLine();

        Collections.addAll(uniqueWords, sentence.split(" "));
        System.out.print("Total number of unique words: " + uniqueWords.size());

        System.out.print("\nHashSet values in alphabetical order: ");
        for (String word : uniqueWords) {
            System.out.print(word + ",");
        }
    }
}