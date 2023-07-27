package Ivan;

import java.util.*;

public class CollectionsOperations {
    public static void main(String[] args) {
        // Task 1: Create an ArrayList of strings and print its content
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("ArrayList of fruits: " + fruits);

        // Task 1: Create a LinkedList of integers, sort it, and print its sorted content
        List<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println("Sorted LinkedList of numbers: " + numbers);

        // Task 2: Create a Set of strings, print its size, and check if a specific name exists
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        System.out.println("Size of the set: " + names.size());
        System.out.println("Does 'Bob' exist in the set? " + names.contains("Bob"));

        // Task 3: Read a sentence, store unique words in a Set, and print the total number and sorted words
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));
        System.out.println("Total unique words: " + uniqueWords.size());
        System.out.println("Unique words in alphabetical order: " + uniqueWords);

        // Task 4: Create a Map of abbreviations and country/capital information
        Map<String, String[]> countryMap = new HashMap<>();
        countryMap.put("MD", new String[]{"Moldova", "Chisinau"});
        countryMap.put("US", new String[]{"United States", "Washington D.C."});
        countryMap.put("JP", new String[]{"Japan", "Tokyo"});

        // Task 5: Retrieve the capital of a specific country from the map
        String capital = countryMap.get("MD")[1];
        System.out.println("Capital of Moldova: " + capital);

        // Task 6: Find students who scored higher than 90 and store their names and scores in a new Map
        Map<String, Integer> highScoringStudents = new HashMap<>();
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Duplicate name with different score
        studentScores2.put("George", 87);

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

        System.out.println("High scoring students: " + highScoringStudents);

        scanner.close();


    }
}