package cristina_savrin.oop.polymorphism.overloading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 3. Create a class called "ArrayUtils" with an overloaded method for finding the maximum element.
 * Implement methods that can find the maximum element in an array of integers, an array of floating-point numbers, and an array of strings.
 */
public class ArrayUtils {

    public int maxElement(List<Integer> integers) {
        return Collections.max(integers);
    }

    public float maxElement(ArrayList<Float> floats) {
        return Collections.max(floats);
    }

    public String maxElement(Collection<String> strings) {
        return Collections.max(strings);
    }
}