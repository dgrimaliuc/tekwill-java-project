package anna_gontari;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
        HashSet<String> animals = new HashSet <String>();
        animals.add("Cats");
        animals.add("Horses");
        animals.add("Dogs");
        animals.add("Mice");
        animals.add("Rabbits");
        System.out.println(animals.size());
        System.out.println(animals.contains("Dogs"));

        //Write a program that reads a sentence from the user and stores each unique word in a Set.
        // Print the total number of unique words and display them in alphabetical order.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write your sentence: ");
        String sentence =  sc.nextLine();
        HashSet<String> UniqueWords = new HashSet<>();

        for (String word: sentence.split( " ")){
            UniqueWords.add(word);
            System.out.print(UniqueWords.size());
        }

        TreeSet<String> SortedWords = new TreeSet<>(UniqueWords);
        System.out.println(UniqueWords.size());
        System.out.println("TreeSet after sorting in alphabetical order" + SortedWords);
        }
}