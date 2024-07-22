package main.java.PotoracMihai.Collections;

import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {

        // Create a Map that stores the abbreviator as keys and names of countries as values. Print them all.
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States");
        countryMap.put("RO", "Romania");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("FR", "France");
        countryMap.put("DE", "Germany");
        countryMap.put("IT", "Italy");
        countryMap.put("ES", "Spain");

        for (String key : countryMap.keySet()) {
            System.out.println(key + " -> " + countryMap.get(key));
        }

        // Create a program that takes a sentence as input and counts the frequency of each word in the sentence.
        // Then, print out each word along with its frequency. (the cat sat on the mat)
        String words = "the cat sat on the mat";
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words.split("")) {
            word = word.toLowerCase();
            int count = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, count + 1);
        }

        //Create a program that simulates a phonebook using a HashMap. Add some contacts to map and prints it’s content.
        //"John Doe", "555-1234"
        //"Jane Smith", "555-5678"
        //"Emily Johnson", "555-8765"
        //"Michael Brown", "555-4321"

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John Doe", "555-1234");
        phoneBook.put("Jane Smith", "555-5678");
        phoneBook.put("Emily Johnson", "555-8765");
        phoneBook.put("Michael Brown", "555-4321");

        for (String key : phoneBook.keySet()) {
            System.out.println(key + " -> " + phoneBook.get(key));
        }
    }
}
