package alina_gutsul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        //Create an array ArrayList of strings and add some fruits inside,
        //print array list on screen
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create array LinkedList of integers and add some numbers,
        // sort this list and print its sorted content
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(15);
        numbers.add(2);
        numbers.add(9);
        numbers.add(10);

        Collections.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
