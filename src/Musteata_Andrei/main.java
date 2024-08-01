package Musteata_Andrei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");
        System.out.println("Size of Set: " + names.size());

        String nameToCheck = "Alice";
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the Set.");
        } else {
            System.out.println(nameToCheck + " does not exist in the Set.");
        }

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        System.out.println("Country Map: " + countryMap);

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

        System.out.println("Students with scores above 90: " + highScorers);
    }
}
