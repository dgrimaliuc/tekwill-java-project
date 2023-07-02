package anna_gontari;

import java.util.*;

public class Maps {
    public static void main(String[] args) {


        //Create a Map that stores the abbreviation as keys and String[] with country name and its capital.
        // Add some pairs to the map and retrieve the capital of a specific country.
        HashMap <String,String> countries = new HashMap<>();
        countries.put("MD", "Moldova, Chisinau");
        countries.put("RO", "Romania, Bucharest");
        countries.put("IT", "Italy, Rome");
        countries.put("BG", "Bulgaria, Sofia");
        countries.put("FR", "France, Paris");

        System.out.println(countries.get("IT"));

        // Given two Maps that contain student names as keys and their corresponding scores as values, write a program to find
        // the students who scored higher than 90 and store their names and scores in a new Map
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

        Map<String, Integer> ScoresOver90 = new HashMap<>();
        for(Map.Entry <String, Integer> entry : studentScores1.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                ScoresOver90.put(name, score);
            }
        }
        for(Map.Entry <String, Integer> entry : studentScores2.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            if (score > 90){
                ScoresOver90.put(name, score);
            }
        }
        System.out.println(ScoresOver90);
    }
}

