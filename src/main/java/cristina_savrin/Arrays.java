package cristina_savrin;

public class Arrays {

    public static void main(String[] args) {

        // 1. Write a program that calculates and prints the sum of all elements in an array of integers.
        int[] arrayInt = {16, 82, 23, 64, 95, 106, 7, 38, 91, 180};
        int sumInt = 0;

        for (int i : arrayInt) {
            sumInt += i;
        }
        System.out.println("The sum of all elements in array: " + sumInt);

        // 2. Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        double[] arrayDouble = {28.15, 6.5834, 75.877, 562.67, 19.564, 870.70};
        double sumDouble = 0;

        for (double j : arrayDouble) {
            sumDouble += j;
        }
        System.out.println("The average value of all elements in array: " + sumDouble / arrayDouble.length);

        // 3. Find max value in an array with numbers
        int[] array1 = {72, 99, 150, 67, 300, 497, 268, 7, 164, 445};
        int max = array1[0];

        for (int k : array1) {
            if (k > max) {
                max = k;
            }
        }
        System.out.println("The max value in array: " + max);

        // 4. (Optional hard task) find second max element
        int[] array2 = {72, 150, 999, 67, 800, 497, 268, 7, 164, 355};
        int max1 = array2[0], max2 = array2[0];
        int index = 0;

        for (int m = 1; m < array2.length; m++) {
            if (array2[m] > max1) {
                max1 = array2[m];
                index = m;
            }
        }
        for (int n = 1; n < array2.length; n++) {
            if (n == index) {
                continue;
            }
            if (array2[n] > max2) {
                max2 = array2[n];
            }
        }
        System.out.println("The second max value in array:  " + max2);
    }
}