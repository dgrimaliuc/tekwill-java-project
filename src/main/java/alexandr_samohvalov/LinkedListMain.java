package alexandr_samohvalov;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {
    // Create array LinkedList of integers and add some numbers, sort this list and print its sorted content
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        numbers.add(34);
        numbers.add(72);
        numbers.add(51);
        numbers.add(3);

        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
