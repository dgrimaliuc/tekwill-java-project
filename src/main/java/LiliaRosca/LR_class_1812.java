package main.java.LiliaRosca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LR_class_1812 {
    public static void main(String[] args) {
//Class 18.12  ArrayList --------------------------------------------
        // ArrayList + afisat in ordine inversa
        /* ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        for (int i = num.size() -1; i >= 0; i --) {
            System.out.println(num.get(i));
        }
        // input de la utlizator in ArrayList pina la "done" + afisare
        ArrayList<String> input = new ArrayList<>();
        String word;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduceti un cuvint sau 'done' pentru a iesi: ");
            word = sc.nextLine();
            input.add(word);
        } while (!word.equals("done"));
        System.out.println("Cuvintele introduse sunt: " + input);

        // de sine statator
        // 1.ArrayList de Integer și afișează elementele sale folosind foreach
/*        ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        for (Integer i : num) {
            System.out.println(i);
        }
        // 2. ArrayList de String și adună toate elementele într-un singur șir, afișează rezultatul
        ArrayList<String> text = new ArrayList<>();
        text.add("nume");
        text.add("prenume");
        text.add("adresa");
        text.add("telefon");
        text.add("email");
        String sum = "";
        for (String s : text) {
            sum += s + " ";
        }
        System.out.println(sum);

// LinkedList -------------------------------------------------

// HashMap ----------------------------------------------------
        HashMap<String, String> capitalCities = new HashMap<>();
        // adding key and value
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // alta modalitate de afisare
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }*/
// HashSet --------------------------------------------------------------
        HashSet<Integer> num = new HashSet<>();
        num.add(5);
        num.add(9);
        num.add(2);
        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

// Collections---------------------------------------------------------


    }

}
