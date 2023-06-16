package Leas_Liudmila;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        allNames(names);
        HashSet<String> word = new HashSet<>();
        sentence(word);
    }


    //1.  Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.

    public static void allNames(HashSet<String> names) {
        names.add("James");
        names.add("Mary");
        names.add("Robert");
        names.add("Jessica");
        System.out.println("List contains " + names.size() + " names");
        System.out.println("Enter your name to check if it is included in the list:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        for (int i = 0; i < names.size(); i++) {
            if (names.contains(input)) {
                System.out.println("Your name is included in the list");
                break;
            } else {
                System.out.println("Your name is not included in the list");
                break;
            }

        }
    }

    //2. Write a program that reads a sentence from the user and stores each unique word in a Set.
    // Print the total number of unique words and display them in alphabetical order.

    public static void sentence(HashSet<String> wordsSet) {
        System.out.println("Enter your text here: ");
        Scanner myScanner = new Scanner(System.in);
        String inputSentence = myScanner.nextLine().toLowerCase();

        for (String word : inputSentence.split(" ")) {
            wordsSet.add(word);
        }
        System.out.println("Your text contains " + wordsSet.size() + " of unique words");
        List<String> list = new ArrayList<String>(wordsSet);
        Collections.sort(list);
        System.out.print(list);
    }
}
