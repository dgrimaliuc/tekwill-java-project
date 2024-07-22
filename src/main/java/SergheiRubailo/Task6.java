package SergheiRubailo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task6 {
    public static void main(String[] args) {
        /*Create an array ArrayList of strings and add some fruits inside, print array list on screen*/

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Banana");

        System.out.println(fruits);

        /*Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.*/
        String specificName = "Alice";
        String message = "Name " + specificName + " doesn't exist in the set";

        HashSet<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Leo");
        names.add("Don");
        names.add("Ralph");

        System.out.println("Size: " + names.size());

        for (String name : names) {
            if (name.equals(specificName)) {
                message = ("Name " + specificName + " exists in the set");
                break;
            }
        }

        System.out.println(message);


        /*Create a Map that stores the abbreviator as keys and names of countries as values. Add some pairs to the map and retrieve the capital of a specific country.
       countryMap.put("USA", "United States of America");
       ("UK", "United Kingdom");
       ("CAN", "Canada");
       ("GER", "Germany");
       ("FRA", "France");
        */

        String specificCountryAbbreviation = "GER";

        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United States of America");
        countries.put("UK", "United Kingdom");
        countries.put("CAN", "Canada");
        countries.put("GER", "Germany");
        countries.put("FRA", "France");

        System.out.println("Country name for " + specificCountryAbbreviation + " abbreviation is: " + countries.get(specificCountryAbbreviation));

        /*Hard optional: Given two Maps that contain student names as keys and their corresponding scores as values,
        write a program to find the students who scored higher than  90  and store their names and scores in a new Map.
        Bellow you can find programm data.
        */

        // Create two Maps of student names and their scores
        HashMap<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        HashMap<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Duplicate name with different score
        studentScores2.put("George", 87);

        HashMap<String, Integer> theBestStudents = new HashMap<>();

        for (String student : studentScores1.keySet()) {
            if (studentScores1.get(student) > 90)
                theBestStudents.put(student, studentScores1.get(student));
        }

        for (String student : studentScores2.keySet()) {
            if (studentScores2.get(student) > 90)
                theBestStudents.put(student, studentScores2.get(student));
        }

        System.out.println("The best students are: " + theBestStudents);
    }
}
