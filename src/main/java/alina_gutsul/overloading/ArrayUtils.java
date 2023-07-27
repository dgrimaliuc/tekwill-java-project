package alina_gutsul.overloading;

public class ArrayUtils {
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double findMax(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static String findMax(String[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        String max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] intArray = { 5, 3, 9, 1, 7 };
        double[] doubleArray = { 2.5, 1.7, 4.8, 3.2 };
        String[] stringArray = { "apple", "banana", "orange", "grape" };

        int maxInt = ArrayUtils.findMax(intArray);
        System.out.println("Max int: " + maxInt);

        double maxDouble = ArrayUtils.findMax(doubleArray);
        System.out.println("Max double: " + maxDouble);

        String maxString = ArrayUtils.findMax(stringArray);
        System.out.println("Max string: " + maxString);
    }
}
