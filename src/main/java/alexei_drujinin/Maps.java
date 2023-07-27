package alexei_drujinin;

import java.util.HashMap;
import java.util.Map;


public class Maps {
    public static void main(String[] args) {
        mapOfCountries();
        mapOfStudentsScore();

    }

    public static void mapOfCountries() {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Moldova", "Chisinau");
        countries.put("Ukraine", "Kiev");
        countries.put("Russia", "Moscow");
        countries.put("Romania", "Bucharest");
        countries.put("Turkish", "Istanbul");

        System.out.println(countries.get("Moldova"));
    }

    public static void mapOfStudentsScore() {
        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Ivan", 89);
        scores1.put("Alexandr", 75);
        scores1.put("Alina", 93);
        scores1.put("Katerina", 91);

        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Dmitriy", 85);
        scores2.put("Arina", 98);
        scores2.put("Marina", 88);
        scores2.put("Kiril", 81);

        Map<String, Integer> scoresOver90 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : scores1.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            if (score > 90) {
                scoresOver90.put(name, score);
            }
        }
        for(Map.Entry <String, Integer> entry : scores2.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            if (score > 90){
                scoresOver90.put(name, score);
            }
        }
        System.out.println(scoresOver90);
    }
}
