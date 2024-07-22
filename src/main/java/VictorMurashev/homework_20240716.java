package VictorMurashev;

import java.util.*;

public class homework_20240716 {
    public static void main(String[] args) {

        //Task 1
        // Create an ArrayList to store fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the fruit list
        System.out.println("Task 1 - ArrayList with fruits \n ====================");
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Task 2
        // Create a HashSet with some names
        HashSet<String> namesSet = new HashSet<>();
        namesSet.add("Ivan");
        namesSet.add("Janna");
        namesSet.add("Olga");
        namesSet.add("Mikhail");
        namesSet.add("Svetlana");

        // Check if specific names exist in the HashSet
        ArrayList<String> namesToCheck = new ArrayList<>();
        namesToCheck.add("Janna");
        namesToCheck.add("Boris");

        System.out.println("==================\n Task 2 - HashSet with names \n ====================");
        for (String name : namesToCheck) {
            if (namesSet.contains(name)) {
                System.out.println(name + " exists in the Set.");
            } else {
                System.out.println(name + " does not exist in the Set.");
            }
        }
        // Task 3 - Students with scores more than 90

        // Creating two HashMaps of student names and their scores
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evgeniya", 85);
        studentScores1.put("Boris", 92);
        studentScores1.put("Dmitry", 78);
        studentScores1.put("Viktor", 95);

        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Elena", 89);
        studentScores2.put("Fedor", 81);
        studentScores2.put("Alexey", 91);
        studentScores2.put("Georgiy", 87);

        // Creating a new HashMap and populating it with all students' scores
        Map<String, Integer> allStudentScores = new HashMap<>();
        allStudentScores.putAll(studentScores1);
        allStudentScores.putAll(studentScores2);

        // Creating a new HashMap to store students with scores higher than 90 and populating it
        Map<String, Integer> highScorers = new HashMap<>();

        for (Map.Entry<String, Integer> entry : allStudentScores.entrySet()) {
            if (entry.getValue() > 90) {
                highScorers.put(entry.getKey(), entry.getValue());
            }
        }

        // Print the high scorers
        System.out.println("==================\n Task 3 - Students with high scores \n ====================");
        System.out.println("Students who scored higher than 90:");
        for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
