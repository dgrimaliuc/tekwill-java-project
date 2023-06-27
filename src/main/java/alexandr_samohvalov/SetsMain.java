package alexandr_samohvalov;

import java.util.*;

public class SetsMain {
    //Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
    public static void names(String[] names) {

        HashSet<String> Names = new HashSet<String>();
        Names.add("Alex");
        Names.add("John");
        Names.add("Alan");
        Names.add("Max");
        Names.add("Zoe");
        Names.add("Anna");
        Names.add("Corina");
        Names.size();
        Names.contains("Zoe");
        System.out.println(Names.size());

        System.out.println(Names.contains("Zoe"));


    }

    // Write a program that reads a sentence from the user and stores each unique word in a Set. Print the total number of unique words and display them in alphabetical order.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        HashSet<String> uniqueWords = new HashSet<>();

        Collections.addAll(uniqueWords, words);

        System.out.println("Total number of unique words: " + uniqueWords.size());

        System.out.println("Unique words in alphabetical order:");
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords);
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}

