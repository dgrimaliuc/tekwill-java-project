package roman_marcov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListArray {
    public static void main(String args[]) {
        arrayList();
        sortingList();
    }

    //  1. Create an array ArrayList of strings and add some fruits inside, print array list on screen
    public static void arrayList() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Ananas");
        arrList.add("Banana");
        arrList.add("Passionfrut");
        arrList.add("Pear");

        System.out.println(arrList);

    }

    //  2. Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
    public static void sortingList() {
        LinkedList linkList = new LinkedList();
        linkList.add(5);
        linkList.add(3);
        linkList.add(6);
        linkList.add(10);
        linkList.add(7);
        linkList.add(9);

        System.out.println("Original list: " + linkList);
        
        System.out.print("Sorted list: ");
        Collections.sort(linkList);
        System.out.println(linkList);
    }
}