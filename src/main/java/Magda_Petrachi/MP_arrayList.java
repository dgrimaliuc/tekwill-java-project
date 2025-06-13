package main.java.Magda_Petrachi;

import java.util.Arrays;
import java.util.LinkedList;

public class MP_arrayList {
    public static void main(String[] args) {
        //task 1
        Integer[] array = {1, 5, 6, 7, 8, 11, 13, 44, 55, 66, 77};

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(array));

        System.out.println("Acesta este primul element: " + numbers.getFirst());
        System.out.println("Acesta este ultimul element: " + numbers.getLast());

        /* task 2
          ArrayList<String> fructe = new ArrayList<>();
        fructe.add("Măr");
        fructe.add("Banana");
        fructe.add("Cireșe");
        fructe.add("Kiwi");
        fructe.add("Ananas");

        System.out.println("Lista de fructe: " + fructe);
         */
    }
}
