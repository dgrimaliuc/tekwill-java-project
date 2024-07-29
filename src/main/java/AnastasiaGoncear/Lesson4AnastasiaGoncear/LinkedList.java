package AnastasiaGoncear.Lesson4AnastasiaGoncear;
<<<<<<< HEAD
=======

>>>>>>> 714e5581d3da5ad18435a80d77ab1deda6d98558
import java.util.Arrays;

public class LinkedList {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] intArray = {10, 20, 30, 40, 50};

        // Convert the array to a LinkedList
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>(Arrays.asList(intArray));

        // Print the first and last items
        System.out.println("First item: " + linkedList.getFirst());
        System.out.println("Last item: " + linkedList.getLast());
    }
}
