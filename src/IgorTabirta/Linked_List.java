package IgorTabirta;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        // Linked List Creation: Write a function to create a linked list from an array of integers. (Arrays.asList())
        // Write a function to reverse a linked list.

        Integer[] arr = {1, 2, 3, 4, 5};
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(arr));

        Collections.reverse(list1);
        System.out.println(list1);

        // Write a function to concatenate (merge) two linked lists.
        LinkedList<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "1", "2", "3", "4", "5");
        LinkedList<String> list3 = new LinkedList<>();
        Collections.addAll(list3, "6", "7", "8", "9", "10");

        LinkedList<String> list4 = new LinkedList<>(list2);
        list4.addAll(list3);

        System.out.println(list4);

        // Convert an array of integers to a Linked list, print the first and the last items.

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        var r = Arrays.asList(arr1);
        LinkedList<Integer> linkedList = new LinkedList<>(r);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

// Sort a linked list of String and print it before and after sorting.

        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("Banana", "Apple", "Kiwi", "Melon", "Orange"));

        System.out.println("Before sorting: " + linkedList1);
        Collections.sort(linkedList1);
        System.out.println("After sorting: " + linkedList1);
        Collections.shuffle(linkedList1);
        System.out.println("After shuffling: " + linkedList1);
        Collections.shuffle(linkedList1);
        System.out.println("After shuffling_2: " + linkedList1);
    }
}
