package Leas_Liudmila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        listMethod(fruits);
        LinkedList<Integer> numbers = new LinkedList<>();
        listMethod2(numbers);

    }

    // 1. Create an array ArrayList of strings and add some fruits inside, print array list on screen
    public static void listMethod(ArrayList<String> fruits) {
        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("mango");
        System.out.println(fruits);
// or
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    //2. Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
    public static void listMethod2(LinkedList<Integer> numbers) {
        numbers.add(156);
        numbers.add(-95);
        numbers.add(82);
        numbers.add(-48);
        numbers.add(5);
        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
