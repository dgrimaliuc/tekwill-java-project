package IngaTitchiev;

import java.util.*;

public class List_Task_HW {
    public static void main(String[] args) {
     //Create an array ArrayList of strings and add some fruits inside,
        // print array list on screen
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pero");
        fruits.add("Melo");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Coco");
        fruits.add("Pruna");
        for (int i = 0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
//Create a Set of strings and add some names to it.
// Print the size of the Set and check if a specific name exists in the Set.
        Set<String> names = new HashSet<>();
        names.add("Alla");
        names.add("Boris");
        names.add("Catalina");
        names.add("David");
        names.add("Damian");
        System.out.println("The size of the Set is: " + names.size());
        String name1 = "Dady";
        if (names.contains(name1)) {
            System.out.println(name1 + " exists in the Set.");
        } else {
            System.out.println(name1 + " does not exist in the Set.");
        }

 //Create a Map that stores the abbreviator as keys and names of countries as values.
        // Add some pairs to the map and print content of map.
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.put("ITA", "Italy");

        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));
        }
        countryMap.put("MD", "Moldova");
        countryMap.put("RO", "Romania");
        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));
        }
        //Given two Maps that contain student names as keys and their corresponding scores as
        // values, write a program to find the students who scored higher than  90  and store
        // their names and scores in a new Map. Bellow you can find programm data.
        Map<String, Integer> Group1 = new HashMap<>();
        Group1.put("Evelina", 85);
        Group1.put("Boris", 100);
        Group1.put("Corina", 88);
        Group1.put("David", 95);

        Map<String, Integer> Group2 = new HashMap<>();
        Group2.put("Evelina", 99);
        Group2.put("Paula", 81);
        Group2.put("Alla", 91); // Duplicate name with different score
        Group2.put("Gheorghe", 67);

        Map<String, Integer> highScorers = new HashMap<>();

        for (Map.Entry<String, Integer> entry : Group1.entrySet()) {
            if (entry.getValue() > 90) {
                highScorers.put(entry.getKey(), entry.getValue());
            }
        }

         for (Map.Entry<String, Integer> entry : Group2.entrySet()) {
            if (entry.getValue() > 90) {
                highScorers.put(entry.getKey(), entry.getValue());
            }
        }

          for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

