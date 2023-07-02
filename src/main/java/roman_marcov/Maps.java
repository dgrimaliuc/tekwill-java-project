package roman_marcov;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {


//     1. Create a Map that stores the abbreviation as keys and String[] with country name and its capital.
//        Add some pairs to the map and retrieve the capital of a specific country.

        Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put("SP", new String[]{"Spain", "Madrid"});
        countries.put("CYP", new String[]{"Cyprus", "Cyprus"});
        countries.put("DE", new String[]{"Germany", "Berlin"});
        countries.put("GR", new String[]{"Greece", "Athens"});
        countries.put("TR", new String[]{"Turkey", "Ankara"});
        System.out.println(countries.get("SP")[1]);


//   2. Given two Maps that contain student names as keys and their corresponding scores as values,
//      write a program to find the students who scored higher than  90  and store their names and scores in a new Map

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
        HashMap<String, Integer> studentBestScores = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();

            if (score > 90) {
                studentBestScores.put(student, score);
            }
        }
        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();

            if (score > 90) {
                studentBestScores.put(student, score);
            }
        }
        System.out.println(studentBestScores);

    }
}
