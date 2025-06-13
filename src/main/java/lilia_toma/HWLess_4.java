package main.java.lilia_toma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class HWLess_4 {
//    public static void main(String[] args) {
//        //1. Liste: Convertește un array de numere întregi într-o listă legată, afișează primul și ultimul element.
//        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        List<Integer> list = Arrays.asList(numbers);
//        System.out.println("Lista creata din array: " + list.getFirst() + ", " + list.getLast());
//
//        var List = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    }}

//        //Creează un array ArrayList de șiruri de caractere și adaugă câteva fructe în acesta,
//        // apoi afișează lista pe ecran.
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("Mar");
//        fruit.add("Ananas");
//        fruit.add("Portocala");
//        fruit.add("Capsuna");
//        fruit.add("Afine");
//            System.out.println("Lista de fructe: " + fruit);
//        }
//     }

//    public static void main(String[] args) {
//        // 2.   Seturi: Creează un Set de șiruri de caractere și adaugă câteva nume în acesta.
//        // Afișează dimensiunea Set-ului și verifică dacă un anumit nume există în Set.
//        HashSet<String> nameSet = new HashSet<>();
//        nameSet.add("Maria");
//        nameSet.add("Ana");
//        nameSet.add("Petru");
//        nameSet.add("Catalin");
//        nameSet.add("Afrodita");
//        nameSet.add("Ana");
//        System.out.println("Setul de nume este: " + nameSet);
//        System.out.println("Dimensiunea Set-ului este: " + nameSet.size());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu numele cautat in Set: ");
//        String searchName = scanner.nextLine();
//
//    if (nameSet.contains(searchName)){
//        System.out.println("Nume: " + searchName + " was found in the set.");
//} else {
//        System.out.println("Nume: " + searchName + " was not found in the set.");
//}
//        }
//    }

//    public static void main(String[] args) {
//        // 3. Map: Creează un Map care stochează abrevierile ca chei și numele țărilor ca valori.
//        // Adaugă câteva perechi în map și afișează pe toate.
//        HashMap<String, String> countryMap = new HashMap<>();
//        countryMap.put("USA", "United States of America");
//        countryMap.put("UK", "United Kingdom");
//        countryMap.put("CAN", "Canada");
//        countryMap.put("GER", "Germany");
//        countryMap.put("FR", "France");
//        for (String key : countryMap.keySet()) {
//            System.out.println(key + " - " + countryMap.get(key));}
//            System.out.println(countryMap);
//    }
//    }

    public static void main(String[] args) {
        //Hard optional: Având două Map-uri care conțin numele studenților ca chei și scorurile corespunzătoare ca valori,
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

        Map<String, Integer> combinedMap = new HashMap<>();
                combinedMap.putAll(studentScores1);
                combinedMap.putAll(studentScores2);
                System.out.println("Map combinat: " + combinedMap);

        Map<String, Integer> highScore = new HashMap<>();
        for (Map.Entry<String, Integer> entry : combinedMap.entrySet()) {
            String studentName = entry.getKey();
            Integer score = entry.getValue();

            if (score > 90)
                highScore.put(studentName, score);
        }
        System.out.println("Nume student, scor mai mare de 90: " + highScore);
    }}
