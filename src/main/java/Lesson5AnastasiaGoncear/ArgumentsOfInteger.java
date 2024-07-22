package Lesson5AnastasiaGoncear;

import java.util.ArrayList;
import java.util.List;

// Create a method that will accept arguments of Integer type,
// return the sum of all provided numbers.
public class ArgumentsOfInteger {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);

        Integer sum = sumOfList(integerList);
        System.out.println("Sum of list: " + sum);
    }

    public static Integer sumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}


