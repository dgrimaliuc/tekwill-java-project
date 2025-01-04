package main.java.georgeVinaga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeWork_18_Dec_2024 {
    public void main(String[] args) {


// 1. Liste: Creează un array ArrayList de șiruri de caractere și adaugă câteva fructe în acesta, apoi afișează lista pe ecran.
//        ArrayList<String> fructe = new ArrayList<>();
//        fructe.add("Portocale");
//        fructe.add("Mandarine");
//        fructe.add("Mere");
//        fructe.add("Piersici");
//        fructe.add("Zmeura");
//        System.out.println(fructe);

//----------------------------------------------------------------------------------------------------------------------
// 2. Seturi: Creează un Set de șiruri de caractere și adaugă câteva nume în acesta. Afișează dimensiunea Set-ului și verifică dacă un anumit nume există în Set.

//        HashSet<String> caractere = new HashSet<>();
//        caractere.add("John");
//        caractere.add("Amanda");
//        caractere.add("Joe");
//        caractere.add("Piter");
//        caractere.add("Max");
//        System.out.println("Dimensiunea setului: " + caractere.size());
//        System.out.println("Este numele Max in set? " + caractere.contains("Max"));


//----------------------------------------------------------------------------------------------------------------------
// 3. Mapă: Creează un Map care stochează abrevierile ca chei și numele țărilor ca valori. Adaugă câteva perechi în map și recuperează capitala unei țări specifice.

//        HashMap<String, String> countryMap = new HashMap<>();
//        countryMap.put("USA", "Washington");
//        countryMap.put("UK", "London");
//        countryMap.put("CAN", "Ottawa");
//        countryMap.put("FRA", "Paris");
//        System.out.println(countryMap.get("UK"));

//----------------------------------------------------------------------------------------------------------------------
//4. Optional: Având două Map-uri care conțin numele studenților ca chei și scorurile corespunzătoare ca valori,
// scrie un program care găsește studenții care au obținut mai mult de 90 și stochează numele și scorurile lor într-un nou Map.

//cu ajutoru la ChatGPT
        HashMap<String, Integer> studentScores1 = new HashMap<String, Integer>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        List<Integer> scoreList = new ArrayList<>(studentScores1.values());
        for (int i = 0; i < scoreList.size(); i++) {
            int score = scoreList.get(i);
            if (score > 90) {
                for (String student : studentScores1.keySet()) {
                    if (studentScores1.get(student) == score) {
                        System.out.println(student + ": " + score);
                    }
                }
            }
        }

        HashMap<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Nume duplicat cu scor diferit
        studentScores2.put("George", 87);

        List<Integer> scoreList2 = new ArrayList<>(studentScores2.values());
        for (int i = 0; i < scoreList2.size(); i++) {
            int score2 = scoreList2.get(i);
            if (score2 > 90) {
                for (String student2 : studentScores2.keySet()) {
                    if (studentScores2.get(student2) == score2) {
                        System.out.println(student2 + ": " + score2);
                    }
                }
            }
        }


//----------------------------------------------------------------------------------------------------------------------


    }
}
