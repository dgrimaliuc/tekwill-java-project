package main.java.LiliaRosca;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LR_1812_HW {
    public static void main(String[] args) {
       // 1. Liste - Creează un array ArrayList de șiruri de caractere și adaugă câteva fructe în acesta, apoi afișează lista pe ecran.
/*        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("Apple");
        fructe.add("Peach");
        fructe.add("Orange");
        fructe.add("Pear");
        fructe.add("Pineapple");
        for (int i = 0; i < fructe.size(); i ++) {
            System.out.println(fructe.get(i));
        }
        //2. Seturi - Creează un Set de șiruri de caractere și adaugă câteva nume în acesta.
        // Afișează dimensiunea Set-ului și verifică dacă un anumit nume există în Set.
        HashSet<String> vegies = new HashSet<String>();
        vegies.add("Potato");
        vegies.add("Tomato");
        vegies.add("Carrot");
        vegies.add("Mashroom");
        vegies.add("Pumpkin");
        System.out.println("Dimensiunea setului este de: " + vegies.size());
        String veg = "Onion";
        if (vegies.contains(veg)){
            System.out.println(veg + " was found in the set.");
        } else {
            System.out.println(veg + " was not found in the set.");
        }
        // 3. Mapă - Creează un Map care stochează abrevierile ca chei și numele țărilor ca valori.
        // Adaugă câteva perechi în map și recuperează capitala unei țări specifice.
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.get("England");
        System.out.println(countryMap.get("CAN"));
 */
        //4. Optional: Având două Map-uri care conțin numele studenților ca chei și scorurile corespunzătoare ca valori,
        //scrie un program care găsește studenții care au obținut mai mult de 90 și stochează numele și scorurile lor într-un nou Map.
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);
        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Nume duplicat cu scor diferit
        studentScores2.put("George", 87);
    // Combinăm cele două Map-uri într-unul singur
        Map<String, Integer> combinedScores = new HashMap<>(studentScores1);
        for (Map.Entry<String, Integer> entry : studentScores2.entrySet()) {
            String studentName = entry.getKey();
            Integer score = entry.getValue();
    // Dacă studentul există deja, alegem scorul mai mare
            if (combinedScores.containsKey(studentName)) {
                Integer existingScore = combinedScores.get(studentName);
                if (score > existingScore) {
                    combinedScores.put(studentName, score);
                }
            } else {
                combinedScores.put(studentName, score);
            }
        }
    // Cream un Map pentru a stoca studenții cu scor peste 90
        Map<String, Integer> topStudents = new HashMap<>();
        for (Map.Entry<String, Integer> entry : combinedScores.entrySet()) {
            if (entry.getValue() > 90) {
                topStudents.put(entry.getKey(), entry.getValue());
            }
        }
    // Afișăm rezultatele
        System.out.println("Studenții cu scor peste 90 sunt: ");
        for (Map.Entry<String, Integer> entry : topStudents.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(combinedScores);
    }
}
