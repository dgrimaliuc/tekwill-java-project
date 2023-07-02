package ana_raetcaia;

public class ArrayUtils {
    //3. Overloading -Create a class called "ArrayUtils" with an overloaded method for finding the maximum element.
    // Implement methods that can find the maximum element in an array of integers, an array of floating-point numbers,
    // and an array of strings.
    public int maximumElement(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double maximumElement(double[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null");
        }
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public String maximumElement(String[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null");
        }
        String max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > Integer.parseInt(max)){
                max = array[i];
            }
        }
        return max;
    }
}



