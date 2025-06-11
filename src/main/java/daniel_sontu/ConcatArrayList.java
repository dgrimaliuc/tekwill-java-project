package main.java.daniel_sontu;

import java.util.Arrays;
import java.util.List;

public class ConcatArrayList {
//    public static void main(String[] args) {
//        // 1. Creează ArrayList
//        ArrayList<String> lista = new ArrayList<>();
//
//        lista.add("Hello ");
//        lista.add("world ");
//        lista.add("Java ");
//
//        StringBuilder rezultat = new StringBuilder();
//        for (String cuvant : lista) {
//            rezultat.append(cuvant);
//        }
//
//        System.out.println("Șirul final este: " + rezultat);
//    }
public static void main(String[] args) {


    Integer[] numbers = {1, 2, 3, 4, 5};
    List<Integer> list = Arrays.asList(numbers);
    System.out.println("Lista creata din array" + list);

}
}
