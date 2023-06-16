package ana_raetcaia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListsMain {
    public static void main (String[]args){
        //1.Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Kiwi");
        fruits.add("Strawberry");

        for (int i=0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        //2.Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
        LinkedList <Integer> numbers = new LinkedList<>();
        numbers.add(43);
        numbers.add(12);
        numbers.add(56);
        numbers.add(34);
        Collections.sort(numbers);
        for (Integer x : numbers) {
            System.out.println(x);
        }
    }
}
