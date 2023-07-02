package serghei_condrasov;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        /*1. Create a Map that stores the abbreviator as keys and String[] with country name and its capital.
        Add some pairs to the map and retrieve the capital of a specific country.*/

        Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[] {"Moldova","Kishinev"});
        countries.put("GR", new String[] {"Greece","Athens"});
        countries.put("FR", new String[] {"France","Paris"});
        countries.put("IT", new String[] {"Italy","Rome"});

        System.out.print(countries.get("FR")[1]);
        System.out.println();

        /*2. Given two Maps that contain student names as keys and their corresponding scores as values,
        write a program to find the students who scored higher than  90  and store their names
        and scores in a new Map. Bellow you can find programm data.*/

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

        Map<String, Integer> studentBest = new HashMap<>();
        for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                studentBest.put(student, score);
            }
        }
        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                studentBest.put(student, score);
            }
        }
        for (Map.Entry<String, Integer> entry : studentBest.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();

            System.out.println(student + " - " + score);
        }
    }
}
