package CristevaEcaterina;

import java.util.HashMap;
import java.util.Map;

public class homework3 {

    public static void main(String[] args) {
      /* 1.Create an array ArrayList of strings and add some fruits inside, print array list on screen

        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Date");
        fruit.add("Fig");
        fruit.add("Grape");

        System.out.println("Fruits in the ArrayList: " + fruit);

        // 2.Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.

        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("Jane");
        names.add("Emily");
        names.add("Michael");
        names.add("Alice");

        System.out.println("Размер набора: " + names.size());
        String nameToCheck = "Emily";
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " существует.");
        } else {
            System.out.println(nameToCheck + " не существует.");
        }
        // 3. Create a Map that stores the abbreviate as keys and names of countries as values. Add some pairs to the map and print content of map.
        //       countryMap.put
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");

        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/

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
        Map<String, Integer> highScoringStudents = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
            if (entry.getValue() > 90) {
                highScoringStudents.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
            if (entry.getValue() > 90) {
                highScoringStudents.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry : highScoringStudents.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
