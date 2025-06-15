package main.java.Magda_Petrachi;

import java.util.HashSet;

public class MP_hashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Maria");
        names.add("Ana");
        names.add("Andrei");
        names.add("Ion");
        names.add("Nico");

        System.out.println("Avem " + names.size() + " nume");
        if (names.contains("Ana")){
            System.out.println("Am gasit numale Ana");
        } else {
            System.out.println("Nu avem asa nume");
        }

    }
}
