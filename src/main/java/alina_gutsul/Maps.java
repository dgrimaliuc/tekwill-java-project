package alina_gutsul;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        // CCreate a Map that stores the abbreviator as keys and String[] with country name and its capital.
        // Add some pairs to the map and retrieve the capital of a specific country.
        Map<String, String[]> countryMap = new HashMap<>();

        countryMap.put("USA", new String[]{"United States of America", "Washington, D.C."});
        countryMap.put("GB", new String[]{"United Kingdom", "London"});
        countryMap.put("FR", new String[]{"France", "Paris"});
        countryMap.put("DE", new String[]{"Germany", "Berlin"});
        countryMap.put("IN", new String[]{"India", "New Delhi"});

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an abbreviation: ");
        String abbreviation = scanner.nextLine().toUpperCase();

        String[] countryDetails = countryMap.get(abbreviation);
        if (countryDetails != null) {
            String country = countryDetails[0];
            String capital = countryDetails[1];
            System.out.println("Capital of " + country + ": " + capital);
        } else {
            System.out.println("Country with abbreviation " + abbreviation + " not found.");
        }

        //Given two Maps that contain student names as keys and their corresponding
        // scores as values, write a program to find the students who scored higher than  90  and store
        // their names and scores in a new Map.

        //!Alina! If I duplicate the same name, but with different points, it simply will not count.
        //Note: if the name with the highest score is after the name with the lowest score, it will come out. And if the opposite, it will not :)
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 45);
        //studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 93); // Duplicate name with different score
        //studentScores2.put("Alice", 45);
        studentScores2.put("George", 87);


        Map<String, Integer> highScoringStudents = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                highScoringStudents.put(student, score);
            }
        }
        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                highScoringStudents.put(student, score);
            }
        }

        for (Map.Entry<String, Integer> entry : highScoringStudents.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            System.out.println(student + ": " + score);
        }
    }
}

