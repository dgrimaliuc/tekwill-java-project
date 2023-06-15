package cristina_savrin.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        // 1. Create a Map that stores the abbreviator as keys and String[] with country name and its capital.
        // Add some pairs to the map and retrieve the capital of a specific country.
        Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put("FR", new String[]{"France", "Paris"});
        countries.put("IN", new String[]{"India", "New Delhi"});
        countries.put("IT", new String[]{"Italy", "Rome"});
        countries.put("MX", new String[]{"Mexico", "Mexico City"});
        countries.put("RO", new String[]{"Romania", "Bucharest"});

        System.out.println("The capital of " + countries.get("IT")[0] + " is " + countries.get("IT")[1]);

        // 2. Given two Maps that contain student names as keys and their corresponding scores as values,
        // write a program to find the students who scored higher than 90 and store their names and scores in a new Map.
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

        Map<String, Integer> excellentStudents = new HashMap<>();

        for (String s1 : studentScores1.keySet()) {
            if (studentScores1.get(s1) > 90) {
                excellentStudents.put(s1, studentScores1.get(s1));
            }
        }
        for (String s2 : studentScores2.keySet()) {
            if (studentScores2.get(s2) > 90) {
                excellentStudents.put(s2, studentScores2.get(s2));
            }
        }
        for (String s3 : excellentStudents.keySet()) {
            System.out.print("\nStudent: " + s3 + " Score: " + excellentStudents.get(s3));
        }
    }
}
