package zabun_mihail.CollectionsT;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        // 1. Create a Map that stores the abbreviator as keys and String[] with country name and its capital.
        // Add some pairs to the map and retrieve the capital of a specific country.
        java.util.Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put("RO", new String[]{"Romania", "Bucharest"});
        countries.put("DE", new String[]{"Germany", "Berlin"});
        countries.put("FR", new String[]{"France", "Paris"});
        countries.put("IT", new String[]{"Italy", "Rome"});
        countries.put("GR", new String[]{"Greece", "Athens"});


        System.out.println("The capital of " + countries.get("DE")[0] + " is " + countries.get("DE")[1]);

        // 2. Given two Maps that contain student names as keys and their corresponding scores as values,
        // write a program to find the students who scored higher than 90 and store their names and scores in a new Map.
        java.util.Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Alina", 80);
        studentScores1.put("Irina", 98);
        studentScores1.put("John", 73);
        studentScores1.put("Alex", 93);

        java.util.Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Natali", 81);
        studentScores2.put("Lora", 74);
        studentScores2.put("Alice", 65);
        studentScores2.put("Oleg", 92);

        java.util.Map<String, Integer> excellentStudents = new HashMap<>();

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
            System.out.print("\n " + s3 + " Score: " + excellentStudents.get(s3));
        }
    }
}

