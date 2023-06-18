package ana_raetcaia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {
    public static void main (String[]args){
        //1.Create a Map that stores the C as keys and names of countries as values.
        // Add some pairs to the map and retrieve the capital of a specific country.
        Scanner sc = new Scanner(System.in);

        String userInput;
        System.out.println("Enter abbreviation of country: ");

        userInput =  sc.nextLine().toUpperCase();

        HashMap<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova","Chisinau"});
        countries.put("BRA", new String[]{"Brazil","Brasilia"});
        countries.put("GRC", new String[]{"Greece","Anthens"});

        System.out.println(countries.get(userInput)[1]);
        //2.2. Given two Maps that contain student names as keys and their corresponding scores as values,
        // write a program to find the students who scored higher than  90  and store their names and scores
        // in a new Map. Bellow you can find program data.
        // Create two Maps of student names and their scores

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

        HashMap<String, Integer> studentBestScores = new HashMap<>();

        for(Map.Entry <String, Integer> entry : studentScores1.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();

            if (score > 90) {
                studentBestScores.put(student, score);
            }
        }
            for(Map.Entry <String, Integer> entry : studentScores2 .entrySet()){
                String student = entry.getKey();
                int score = entry.getValue();

                if (score >90){
                    studentBestScores.put(student, score);
                }
        }
        System.out.println(studentBestScores);

        }


}
