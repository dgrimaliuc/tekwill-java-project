package main.java.iuliaNamolovan.IN_hm4;

import java.util.HashMap;
import java.util.Map;

public class IN_hm43 {
    public static void main(String[] args) {
        //prima mapa
        Map<String, Integer> stSc1 = new HashMap<>();
        stSc1.put("Evelina", 85);
        stSc1.put("Bob", 92);
        stSc1.put("Charlie", 78);
        stSc1.put("David", 95);

        //mapa 2
        Map<String, Integer> stSc2 = new HashMap<>();
        stSc2.put("Eve", 89);
        stSc2.put("Frank", 81);
        stSc2.put("Alice", 91);
        stSc2.put("George", 87);
// Noua mapă pentru studenți cu scoruri mai mari de 90
        Map<String, Integer> highScorers = new HashMap<>();

        // Adăugăm din prima mapă
        for (Map.Entry<String, Integer> entry : stSc1.entrySet()) {
            if (entry.getValue() > 90) {
                highScorers.put(entry.getKey(), entry.getValue());
            }
        }

        // Adăugăm din a doua mapă
        for (Map.Entry<String, Integer> entry : stSc2.entrySet()) {
            if (entry.getValue() > 90) {
                highScorers.put(entry.getKey(), entry.getValue());
            }
        }

        // Afișăm noua mapă
        System.out.println("Studenți cu scoruri mai mari de 90:");
        for (Map.Entry<String, Integer> entry : highScorers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}