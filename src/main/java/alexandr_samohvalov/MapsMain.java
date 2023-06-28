package alexandr_samohvalov;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class MapsMain {
    // Create a Map that stores the abbreviation as keys and String[] with country name and its capital. Add some pairs to the map and retrieve the capital of a specific country.
    public static void abbreviation(String[] args) {
        Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put("FR", new String[]{"France", "Paris"});
        countries.put("UK", new String[]{"United Kingdom", "London"});
        countries.put("US", new String[]{"United States", "New York"});
        System.out.println(countries.get("FR")[1]);
    }

    // Given two Maps that contain student names as keys and their corresponding scores as values,
    //write a program to find the students who scored higher than  90  and store their names and scores in a new Map.

        public static void main(String[] args) {
            // Create two Maps of student names and their scores
            Map<String, Integer> studentScores1 = new HashMap<>();
            studentScores1.put("Evelina", 85);
            studentScores1.put("Bob", 92);
            studentScores1.put("Charlie", 78);
            studentScores1.put("David", 95);

            Map<String, Integer> studentScores2 = new HashMap<>();
            studentScores2.put("Eve", 89);
            studentScores2.put("Frank", 81);
            studentScores2.put("Alice", 91);
            studentScores2.put("George", 87);

            Map<String, Integer> highScorers = new HashMap<>();

            for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            System.out.println("Students who scored higher than 90:");
            for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Score: " + entry.getValue());
            }
        }
    }

