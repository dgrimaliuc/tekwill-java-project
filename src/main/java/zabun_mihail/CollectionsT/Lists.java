package zabun_mihail.CollectionsT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        listFruits(fruits);
        LinkedList<Integer> numbers = new LinkedList<>();
        listNumbers(numbers);

    }

    // 1. Create an array ArrayList of strings and add some fruits inside, print array list on screen
    public static void listFruits(ArrayList<String> fruits) {
        fruits.add("peach");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("strawberry");
        System.out.println(fruits);
// or
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    //2. Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
    public static void listNumbers(LinkedList<Integer> numbers) {
        numbers.add(16);
        numbers.add(-5);
        numbers.add(25);
        numbers.add(43);
        numbers.add(-51);
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}

