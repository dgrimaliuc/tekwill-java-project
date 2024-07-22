package main.java.PotoracMihai.Collections;

import java.util.*;

public class ExampleArrayList {
    public static void main(String[] args) {

        // Create an ArrayList of integers and add some numbers to it. Print the elements of the ArrayList in reverse order.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        // Write a program that takes input from the user and stores it in an ArrayList.
        // Keep taking input until the user enters "done" and then display the contents of the ArrayList.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        String input = "";
        while (!input.equals("done")) {
            System.out.println("Enter a number: ");
            input = scanner.nextLine();
            if (!input.equals("done")) {
                inputNumbers.add(Integer.parseInt(input));
            }
        }
        System.out.println("The numbers are: " + inputNumbers);

        //Given two ArrayLists of integers, write a program to find the common
        // elements between them and store them in a new ArrayList.

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2, 1, 2, 3, 4, 5, 6, 7);


        for (int i = 0; i < numbers1.size(); i++) {
            for (int j = 0; j < numbers2.size(); j++) {

                if (numbers1.get(i) == numbers2.get(j)) {
                    System.out.println(numbers1.get(i));
                }

            }
        }
/*
        //Create an Arraylist of Integer and print it is elements using foreach.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        for (Integer i : numbers) {
            System.out.println(i);
        }

        //Create an Arraylist of String and collect all elements in single string, print result.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("2");
        strings.add("0");
        strings.add("0");
        strings.add("2");
        System.out.println(String.join(" ", strings));
*/

        // Create an Arraylist of String and collect all elements in single string, print result.
        List<String> nums = Arrays.asList("1", "2", "3", "4", "5");
        String result = "";

        for (String num : nums) {
            result += num + " ";
        }
        System.out.println(result.trim());
    }
}


