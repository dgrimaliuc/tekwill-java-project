package dmitrii_tofan._HW_3;

public class Arrays_Main {
    public static void main(String[] args) {
// 1.Write a program that calculates and prints the sum of all elements in an array of integers.
        Integer[] num = {1, 25, 36, 28, -65};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Сумма чисел массива: " + sum);

// 2.Create a program that finds and displays the average value of all elements in an array of floating-point numbers
        System.out.println("---------------------------------------------------");
        double[] num2 = {25, 65, 96, 5, 852, 75};

        double average = 0;
        for (int j = 0; j < num2.length; j++) {
            average += num2[j];
        }
        average = average / num2.length;

        System.out.println("Average: " + average);
        System.out.println("---------------------------------------------------------");

// 3.Find max value in an array with numbers
        int[] num3 = {25,65,89,756,741,965};
        int max = num3[0];
        for (int i = 0; i < num3.length; i++) {
            if (num3[i] > max) {
                max = num3[i];
            }
        }
        System.out.println("Max num in array: " + max);
    }
}



