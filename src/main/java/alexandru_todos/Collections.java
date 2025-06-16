package main.java.alexandru_todos;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 1. Convert int array to ArrayList. Show first and last element
        int [] list = {1,2,3,4,5};
        List<Integer> arrayList = new ArrayList<>();
        for (int num : list) {
            arrayList.add(num);
        }
        System.out.println("First element of ArrayList is: " + arrayList.getFirst());
        System.out.println("Last element of ArrayList: " + arrayList.getLast());

        // 2. Create ArrayList of strings, then add fruits in it.
        // After that, show final list in terminal
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Banana");
        System.out.println("My favorite fruits are: " + fruits);

        // 3. Create a Set of strings and add some names.
        // Display set dimension and verify if name exists in set
        HashSet<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Ivan");
        names.add("Ana");
        names.add("Alina");
        System.out.println("Dimension of this set is: " + names.size());
        System.out.println("Check if name Alex is in this set: " + names.contains("Alex"));
        System.out.println("Check if name Aliona is in this set: " + names.contains("Aliona"));

        // 4. Create a Map that contains abbreviation as a key and country name as a value.
        // Add some key-values in Map and display them.
        HashMap<String, String> abbreviation = new HashMap<>();
        abbreviation.put("UK", "United Kingdom");
        abbreviation.put("CAN", "Canada");
        abbreviation.put("GER", "Germany");
        abbreviation.put("MD", "Moldova");
        for (String i : abbreviation.keySet()) {
            System.out.println("Abbreviation: " + i + ", Country name: " + abbreviation.get(i));
        }

        // 5. You have 2 Maps with list of students (key) and their scores (value).
        // Write a program that will find students that have score > 90 and
        // write their names and scores in new map

        HashMap<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        HashMap<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91);
        studentScores2.put("George", 87);

        HashMap<String, Integer> allStudentScores = new HashMap<>();
        allStudentScores.putAll(studentScores1);
        allStudentScores.putAll(studentScores2);

        HashMap<String, Integer> finalList = new HashMap<>();

        for (String i : allStudentScores.keySet()) {
            if (allStudentScores.get(i) >= 90){
                finalList.put(i, allStudentScores.get(i));
            }
        }
        for (String i : finalList.keySet()) {
            System.out.println("Student name: " + i + ", Student score: " + finalList.get(i));
        }
    }
}
