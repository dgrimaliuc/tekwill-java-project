package serghei_condrasov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {

   /* 1. Create an array ArrayList of strings and add some fruits inside,
    print array list on screen.*/
    public static void main(String[] args) {
        myArrayList();
        myLinkedList();
    }
    public static void myArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Aplle");
        list.add("Grapefruit");

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    /*2. Create array LinkedList of integers and add some numbers,
    sort this list and print its sorted content.*/
    public static void myLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(25);
        linkedList.add(50);
        linkedList.add(30);
        linkedList.add(68);

        Collections.sort(linkedList);

        for (int a = 0; a < linkedList.size(); a++)
            System.out.print(linkedList.get(a) + " ");
    }
}
