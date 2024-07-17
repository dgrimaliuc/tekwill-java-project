package TatianaJeleascov;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //Create new list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        //Set of string
        Set<String> names = new HashSet<>();
        names.add("Ion");
        names.add("Sandu");
        names.add("Maia");
        System.out.println("Size of the set: " + names.size());
        System.out.println("Contains 'Maia' " + names.contains("Maia"));

        //map string
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("MDA", "Republic of Moldva");
        countryMap.put("RO", "Romaina");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("RU", "Russia");

        System.out.println(countryMap);

        // Create two Maps of student names and their scores
        Map<String, Integer> studentScores1 = new HashMap<>();
//      studentScores1.put(Evelina”, 85);
//      studentScores1.put(“Bob”, 92);
//      studentScores1.put(“Charlie”, 78);
//      studentScores1.put(“David”, 95);
        Map<String, Integer> studentScores2 = new HashMap<>();
//      studentScores2.put(“Eve”, 89);
//      studentScores2.put(“Frank”, 81);
//      studentScores2.put(“Alice”, 91); // Duplicate name with different score
//      studentScores2.put(“George”, 87);

        Map<String, Integer> highScorers = new HashMap<>();

        for (Map<String, Integer> map : Arrays.asList(studentScores1, studentScores2)) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
