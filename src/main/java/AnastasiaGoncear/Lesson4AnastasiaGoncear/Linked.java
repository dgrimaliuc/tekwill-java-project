package AnastasiaGoncear.LessonAnastasiaGoncear;

import java.util.Collections;
import java.util.LinkedList;

public class Linked {


        public static void main(String[] args) {
            // Create a LinkedList of String
            LinkedList<String> linkedList = new LinkedList<>();

            // Add elements to the LinkedList
            linkedList.add("banana");
            linkedList.add("apple");
            linkedList.add("cherry");
            linkedList.add("date");
            linkedList.add("elderberry");

            // Print the LinkedList before sorting
            System.out.println("Before sorting: " + linkedList);

            // Sort the LinkedList
            Collections.sort(linkedList);

            // Print the LinkedList after sorting
            System.out.println("After sorting: " + linkedList);
        }
    }

