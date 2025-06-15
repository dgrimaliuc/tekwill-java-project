package main.java.NataliaChihai;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        //Convertește un array de numere întregi într-o listă legată, afișează primul și ultimul elemen

        Integer[] array = {10, 20, 30, 40, 50};
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(array));
        if (!linkedList.isEmpty()) {
            System.out.println("Primul element: " + linkedList.getFirst());
            System.out.println("Ultimul element: " + linkedList.getLast());
        } else {
            System.out.println("Lista este goala.");
        }
// Creează un array ArrayList de șiruri de caractere și adaugă câteva fructe în acesta, apoi afișează lista pe ecran.
        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Banana");
        fructe.add("Cireasa");
        fructe.add("Portocala");
        fructe.add("Para");
        for (String fruct : fructe) {
            System.out.println(fruct);
        }

        //Creează un Set de șiruri de caractere și adaugă câteva nume în acesta. Afișează dimensiunea Set-ului și verifică dacă un anumit nume există în Set.
        Set<String> nume = new HashSet<>();
        nume.add("Mihai");
        nume.add("Maria");
        nume.add("Andrei");
        nume.add("Elena");
        nume.add("Natalia");

        System.out.println(nume.size());
        String find = "Maria";
        if (nume.contains(find)) {
            System.out.println(find + " se afla in set.");
        } else {
            System.out.println(find + " nu se afla in set.");
        }

        //
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

        System.out.println(studentScores1);
        System.out.println(studentScores2);
    }
}
