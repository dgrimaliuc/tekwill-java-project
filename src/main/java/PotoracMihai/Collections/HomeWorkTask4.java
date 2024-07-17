package main.java.PotoracMihai.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWorkTask4 {
    public static void main(String[] args) {

        //Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList<String> typesOfFruits = new ArrayList<>();
        typesOfFruits.add("Apple");
        typesOfFruits.add("Banana");
        typesOfFruits.add("Orange");
        typesOfFruits.add("Grape");
        typesOfFruits.add("Peach");
        typesOfFruits.add("Kiwi");
        typesOfFruits.add("Pineapple");
        System.out.println(typesOfFruits);

        //Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
        Set<String> names = Set.of("John", "Doe", "Jane", "Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        System.out.println("The size of the set is: " + names.size());
        if (names.contains("Alice")) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }

        //Create a Map that stores the abbreviator as keys and names of countries as values. //Add some pairs to the map and print content of map.
        /*countryMap.put(“USA”, “United States of America”);
        (“UK”, “United Kingdom”);
        (“CAN”, “Canada”);
        (“GER”, “Germany”);
        (“FRA”, “France”);*/

        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "Unitated States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.put("ITA", "Italy");
        countryMap.put("ESP", "Spain");

        for (String key : countryMap.keySet()) {
            System.out.println(key + " -> " + countryMap.get(key));
        }

        //Given two Maps that contain student names as keys and their corresponding scores as values,
        // write a program to find the students who scored higher than  90  and store their names and scores in a new Map.

        // Create two Maps of student names and their scores
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);
        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Duplicate name with different score
        studentScores2.put("George", 87);

        // Create a new Map to store the students who scored higher than 90
        Map<String, Integer> highScorers = new HashMap<>();
        for (String key : studentScores1.keySet()) {
            if (studentScores1.get(key) > 90) {
                highScorers.put(key, studentScores1.get(key));
            }
        }
        for (String key : studentScores2.keySet()) {
            if (studentScores2.get(key) > 90) {
                highScorers.put(key, studentScores2.get(key));
            }
        }
        for (String key : highScorers.keySet()) {
            System.out.println(key + " -> " + highScorers.get(key));
        }
        
    }
}
