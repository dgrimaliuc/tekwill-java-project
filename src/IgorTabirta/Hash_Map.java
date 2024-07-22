package IgorTabirta;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        // Create a Map that stores the abbreviator as keys and names of countries as values. Print them all.

        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.put("ITA", "Italy");
        System.out.println(countryMap);

        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));
        }

        // Create a program that takes a sentence as input and counts the frequency of each word in the sentence.
// Then, print out each word along with its frequency. (the cat sat on the mat)
        String words = "The cat sat on the mat";
        HashMap<String, Integer> wordFrequency = new HashMap<>();


        for (String word : words.split(" ")) {
            // Convert the word to lowercase for case-insensitive comparison
            word = word.toLowerCase();
            // Update the word count in the Map
            int count = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, count + 1);
        }

        System.out.println("Word frequency: " + wordFrequency);

        //Create a program that simulates a phonebook using a HashMap.
        // Add some contacts to map and prints it’s content.
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("John Doe", "555-1234");
        contacts.put("Jane Smith", "555-5678");
        contacts.put("Emily Johnson", "555-8765");
        contacts.put("Michael Brown", "555-4321");
        System.out.println(contacts);
        for (String key : contacts.keySet()) {
            System.out.println(key + " : " + contacts.get(key));
        }


    }
}
