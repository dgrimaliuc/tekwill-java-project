package ana_raetcaia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetsMain {
    //1.Create a Set of strings and add some names to it.
    // Print the size of the Set and check if a specific name exists in the Set.
    public static void main (String[]args){

        HashSet<String> names = new HashSet<>();
        names.add("Maria");
        names.add("Alisa");
        names.add("Ivan");
        names.add("Denis");
        names.add("Ira");

        for (String i : names){
            System.out.println(i);
        }
        System.out.println("Does the name exist in the Set? "  + names.contains("Oleg"));

      //2.Write a program that reads a sentence from the user and stores each unique word in a Set.
        // Print the total number of unique words and display them in alphabetical order.

        Scanner sc = new Scanner(System.in);
        //String userInput;
        System.out.println("Write a sentence: ");

        String sentence =  sc.nextLine().toLowerCase();

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word: sentence.split( " ")){
            uniqueWords.add(word);
            System.out.println(uniqueWords.size());
        }

        TreeSet<String> sortedWords = new TreeSet<>(uniqueWords);
        System.out.println(uniqueWords.size());
        for (String words : sortedWords) {
            System.out.println(words);
        }
    }
}
