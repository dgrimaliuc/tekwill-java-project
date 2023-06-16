package denis_grimaliuc;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

    //2. Write a program that counts the frequency of words in a sentence and stores them in a Map.
    // Print the word count for each unique word.


    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i.toString());
        }
    }

    //
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("");
        ar.add("");
        ar.add("");
        ar.add("");

        Collections.fill(ar, "1");

        for (String el : ar) {
            System.out.println(el);
        }

    }
}
