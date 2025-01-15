package main.java.IonErm.Old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Avocado");
        fruits.add("Apple");
        fruits.add("Coconut");
        for (String i : fruits) {
            System.out.println(i);
        }

        HashSet<String> names = new HashSet<>();
        names.add("Rick");
        names.add("Kyle");
        names.add("Joe");
        names.add("John");
        names.add("Mark");
        names.add("Joe");
        names.add("Kyle");
        System.out.println("Size of set: " + names.size());
        if (names.contains("John")) {
            System.out.println("Name in the set");
        } else {
            System.out.println("Name not in the set");
        }

        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United State of America");
        countries.put("UK", "United Kingdom");
        countries.put("MD", "Moldova");
        countries.put("CAN", "Canada");
        countries.put("GER", "Germany");
        countries.put("FRA", "France");
        System.out.println(countries.get("MD"));

        /*S*/
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);
        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Nume duplicat cu scor diferit
        studentScores2.put("George", 87);
        Map<String, Integer> studentScoresMore90 = new HashMap<>();

        studentScores1.forEach((name, score) -> {
            if (score > 90) studentScoresMore90.put(name, score);
        });
        studentScores2.forEach((name, score) -> {
            if (score > 90) studentScoresMore90.put(name, score);
        });
        System.out.println("Students with score more then 90:");
//      studentScoresMore90.forEach((name, score) -> System.out.println(name + ": " + score));
        for (Map.Entry<String, Integer> entry : studentScoresMore90.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //2-nd method
//        for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
//            if (entry.getValue() > 90) {
//                studentScoresMore90.put(entry.getKey(), entry.getValue());
//            }
//        }
//        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
//            if (entry.getValue() > 90) {
//                studentScoresMore90.put(entry.getKey(), entry.getValue());
//            }
//        }
    }
}
