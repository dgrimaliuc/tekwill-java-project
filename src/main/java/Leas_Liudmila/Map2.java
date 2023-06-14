package Leas_Liudmila;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
//Given two Maps that contain student names as keys and their corresponding scores as values,
// write a program to find the students who scored higher than  90  and store their names and scores in a new Map. Bellow you can find program data.

    public static void main(String[] args) {
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

        HashMap<String, Integer> resultingHashMap = new HashMap<>();

        for(String name : studentScores1.keySet()) {
            Integer score = studentScores1.get(name);

            if(score > 90) {
                resultingHashMap.put(name, score);
            }
        }
        for(String name : studentScores2.keySet()) {
            Integer score = studentScores2.get(name);

            if(score > 90) {
                resultingHashMap.put(name, score);
            }
        }

        System.out.println(resultingHashMap);
    }
}
