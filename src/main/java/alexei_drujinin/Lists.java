package alexei_drujinin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {
        printArrayList();
        printLinkedList();

    }

    public static void printArrayList(){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Lemon");
        arrList.add("Banana");
        arrList.add("Melon");
        arrList.add("kiwi");
        System.out.println(arrList);
    }
    public static void printLinkedList(){
        LinkedList<Integer> linList = new LinkedList<>();
        linList.add(4);
        linList.add(8);
        linList.add(1);
        linList.add(9);
        linList.add(5);
        System.out.println("Inserted numbers before sorting " +linList);
        Collections.sort(linList);
        System.out.print("LinkedList after sorting ");
        for (int number : linList) {
            System.out.print(number + ", ");
        }
    }
}
