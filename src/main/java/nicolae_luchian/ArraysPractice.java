package main.java.nicolae_luchian;

import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        var colors1 = new ArrayList<>(); // the same as the above line

        // add items
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);

        // access items
        System.out.println(colors.get(0)); // red

        // get the number of items
        System.out.println(colors.size()); // 3

        // remove items
        //colors.remove("green");
        //System.out.println( colors ); // red, blue
        //colors.remove(0);
        //System.out.println( colors ); // green, blue

        // modify items
        colors.set(1, "purple"); // change the value of the element on index 3);
        System.out.println(colors); // red, green, purple

        // check if the array contains an item
        System.out.println(colors.contains("red")); // true
        System.out.println(colors.contains("orange")); // false

        // loop through an array
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String item : colors) {
            System.out.println(item);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }


        // Create an ArrayList of Strings named words. Ask the user to enter a word until they enter the word “java”.
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Please insert a word:");
            input = scanner.nextLine();
            words.add(input);
        } while (!input.equals("java"));

        // Print the list of words
        for (String word : words) {
            System.out.println(word);
        }

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");

        for (String item : cars) {
            System.out.println(item);
        }

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        String newFruit = "";

        for (String fruit : fruits) {
            newFruit += fruit;
        }
        System.out.println(newFruit);

        // Convert the ArrayList into an Array
        Integer[] nums = {1, 2, 3, 4, 5};
        List<Integer> nums1 = Arrays.asList(nums);
        System.out.println(nums1);

        // Sort the ArrayList in reverse order
        Collections.reverse(nums1);
        System.out.println(nums1);

        // Concatenate the following two ArrayLists into a new ArrayList
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = new ArrayList<>(list1);
        list3.addAll(list2);
        System.out.println(list3);

        // HashMap - key value pairs
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Romania", "Bucharest");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Roma");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals);

        // Print the capital of Italy
        System.out.println(capitals.get("Italy"));

        // Print the keys of the HashMap
        for (String key : capitals.keySet()) {
            System.out.println(key);
        }

        // Print the values of the HashMap
        for (String value : capitals.values()) {
            System.out.println(value);
        }

    }
}
