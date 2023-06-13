package alina_gutsul;

public class Arrays {
    public static void main(String[] args) {
        //Write a program that calculates and prints the sum of all elements in an array of integers.
        System.out.println("1. Write a program that calculates and prints the sum of all elements in an array of integers.");
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);

        //Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        System.out.println("\n2. Create a program that finds and displays the average value of all elements in an array of floating-point numbers.");
        double[] numbers2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        double sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum2 += numbers[i];
        }

        double average = sum2 / numbers.length;

        System.out.println("Average: " + average);

        //Find max value in an array with numbers
        System.out.println("\n3. Find max value in an array with numbers");
        int[] numbers3 = {10, 20, 5, 15, 25};
        int max = numbers3[0];

        for (int i = 1; i < numbers3.length; i++) {
            if (numbers3[i] > max) {
                max = numbers3[i];
            }
        }

        System.out.println("Max Value: " + max);

        //(Optional hard task ) find second max element
        System.out.println("\n4. (Optional hard task) find second max element");
        int[] numbers4 = {10, 20, 5, 15, 25};
        int max4 = numbers4[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > max4) {
                secondMax = max4;
                max4 = numbers4[i];
            } else if (numbers4[i] > secondMax && numbers4[i] != max4) {
                secondMax = numbers4[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found.");
        } else {
            System.out.println("Second Max Value: " + secondMax);
        }

        //(Optional hard task) sort an integer array with any alghoritm of sorting
        System.out.println("\n5. (Optional hard task) sort an integer array with any alghoritm of sorting");
        int[] numbers5 = {5, 2, 8, 1, 9};

        // Bubble Sort Algorithm
        for (int i = 0; i < numbers5.length - 1; i++) {
            for (int j = 0; j < numbers5.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (numbers5[j] > numbers5[j + 1]) {
                    int temp = numbers5[j];
                    numbers5[j] = numbers5[j + 1];
                    numbers5[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < numbers5.length; i++) {
            System.out.print(numbers5[i] + " ");
        }
    }
}
