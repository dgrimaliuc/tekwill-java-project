package AnastasiaGoncear.Lesson4HomeWorkAnastasiaGoncear;
//Given two Maps that contain student names as keys and their corresponding scores as values,
// write a program to find the students who scored higher than  90  and store their names
// and scores in a new Map.
//the code is not mine. This is to learn how to write such kind of tasks
import java.util.HashMap;
import java.util.Map;

    public class Task3Optional {
        public static void main(String[] args) {
            // Create two Maps of student names and their scores
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

            // Create a new Map to store students who scored higher than 90
            Map<String, Integer> highScorers = new HashMap<>();

            // Process the first map
            for (Map.Entry<String, Integer> entry : studentScores1.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            // Process the second map
            for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
                if (entry.getValue() > 90) {
                    highScorers.put(entry.getKey(), entry.getValue());
                }
            }

            // Print the content of the highScorers map
            for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
                System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
            }
        }
    }

