package ChirilBortnicov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    While
Calculate the sum of numbers from 55 to 111 using a do-while loop.
For
Calculate the sum of numbers from 1 to 100 using a for loop.
Arrays
Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
     */
    public static void main(String[] args) {
       /* int sum = 0;
        int i = 55;
        do {
            sum += i;
            i++;
        } while (i <= 111);
        System.out.println(sum); */

        /*  int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum); */
        double[] AverageValue = new double[]{21.3, 42.3, 12.5, 54, 41.6, 22.8, 49.1, 53.7, 12.1, 60};
        double sum = Arrays.stream(AverageValue).sum();
        System.out.println(sum);
        }
}
