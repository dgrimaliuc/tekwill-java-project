package anna_gontari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        //Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pomegranate");
        fruits.add("pineapple");
        fruits.add("watermelon");
        fruits.add("grapes");
        System.out.println(fruits);


        //Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(11);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        Collections.sort(numbers);
        System.out.println("Sorted List:"+numbers);


    }
}




