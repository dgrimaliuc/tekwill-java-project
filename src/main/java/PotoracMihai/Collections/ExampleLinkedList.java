package main.java.PotoracMihai.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {

        // Linked List Creation: Write a function to create a linked list from an array of integers. (Arrays.asList())
        // Write a function to reverse a linked list.

        Integer[] arr = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));

        Collections.reverse(list);
        System.out.println(list);

        //Write a function to concatenate (merge) two linked lists.
        LinkedList<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "1", "2", "3", "4", "5");
        LinkedList<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "6", "7", "8", "9", "10");

        LinkedList<String> list3 = new LinkedList<>(list1);
        list3.addAll(list2);

        System.out.println(list3);

        //Convert an array of integers to a Linked list, print the first and the last items.
        Integer[] array = {1, 2, 3, 4, 5, 10, 200, 123, 111};
        LinkedList<Integer> ListOfNumbers = new LinkedList<>(Arrays.asList(arr));
        System.out.println(ListOfNumbers.getFirst());
        System.out.println(ListOfNumbers.getLast());

        //Sort a linked list of String and print it before and after sorting. (Collections.sort())
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Potorac", "Mihai", "Tekwill", "Java", "Project"));

        System.out.println("Before sorting: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("After shuffling: " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("After shuffling: " + linkedList);
    }
}
