package VictorMurashev;

import java.util.*;

public class lesson_20240715 {
    public static void main(String[] args) {

        //Task 3.1
        // Create a phonebook-HashMap
        HashMap<String, String> phonebook = new HashMap<>();

        // Add the contacts to the phonebook
        phonebook.put("John Doe", "555-1234");
        phonebook.put("Jane Smith", "555-5678");
        phonebook.put("Emily Johnson", "555-8765");
        phonebook.put("Michael Brown", "555-4321");

        // Print the contents of the phonebook
        for (String name : phonebook.keySet()) {
            System.out.println("Name: " + name + ", Phone: " + phonebook.get(name));
        }

/*
        //Task 2.1

        // Creating Array list
        Integer[] array = {10, 20, 30, 40, 50};

        //Converting into LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(array));

        // Printing first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("last element: " + linkedList.getLast());


        // Task2.2
        // Create an array of strings
        String[] arrayFruits = {"Banana", "Apple", "Cherry", "Date", "Elderberry"};

        // Convert the array to a LinkedList
        LinkedList<String> strings = new LinkedList<>(Arrays.asList(arrayFruits));

        // Print the list before sorting
        System.out.println("List before sorting:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Sort the list
        Collections.sort(strings);

        // Print the list after sorting
        System.out.println("\nList after sorting:");
        for (String str : strings) {
            System.out.println(str);
        }

        // ArrayList for info about cars
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Toyota", "Honda", "Ford", "BMW", "Audi"));


        for (String car : cars) {
            System.out.println(car);
        }



        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        for (Integer number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1"));
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(" ");
        }
        System.out.println(result.toString());  */

    }


}


