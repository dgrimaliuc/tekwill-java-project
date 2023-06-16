package cristina_savrin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // 1. Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Oranges");
        fruits.add("Bananas");
        fruits.add("Kiwi");
        fruits.add("Peaches");
        fruits.add("Lemons");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(85);
        numbers.add(37);
        numbers.add(104);
        numbers.add(0);
        numbers.add(445);
        numbers.add(15);
        Collections.sort(numbers);

        printArrayList(fruits);
        printLinkedList(numbers);
    }

    // 1. Create an array ArrayList of strings and add some fruits inside, print array list on screen
    public static void printArrayList(ArrayList<String> fruits) {
        System.out.print("\nFruits from ArrayList: ");
        for (String f : fruits) {
            System.out.print(f + ", ");
        }

    }

    // 2. Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
    public static void printLinkedList(LinkedList<Integer> numbers) {
        System.out.print("\nNumbers from LinkedList: ");
        for (Integer n : numbers) {
            System.out.print(n + ", ");
        }
    }
}
