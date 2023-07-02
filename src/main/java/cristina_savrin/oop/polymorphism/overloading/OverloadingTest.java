package cristina_savrin.oop.polymorphism.overloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class OverloadingTest {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        List<Integer> integers = Arrays.asList(18, 5, 605, 33, 98, 234);
        System.out.println("Maximum int element is: " + arrayUtils.maxElement(integers));

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(18.5f);
        floats.add(5.12f);
        floats.add(605.3f);
        floats.add(33.89f);
        floats.add(98.45f);
        floats.add(234.9f);
        System.out.println("Maximum float element is: " + arrayUtils.maxElement(floats));

        Collection<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList("abc", "XYZ", "qwerty", "ABC", "www", "OOP"));
        System.out.println("Maximum string element is: " + arrayUtils.maxElement(strings));
    }
}