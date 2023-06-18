package Serghei_Stoianov;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value for the length of array");
        int lengthArr = scanner.nextInt();
        int[] array = new int[lengthArr];
        for (i = 0; i < lengthArr; i++) {
            System.out.println("enter a element of array");
            array[i] = scanner.nextInt();

        }
        System.out.println("your array is");
        for (int el : array)
            System.out.print(el + " ");


//Write a program that calculates and prints the sum of all elements in an array of integers.
        int sum = 0;
        for (i = 0; i < lengthArr; i++)
            sum += array[i];

        System.out.println("\n the sum of all elements in an array " + sum);

//Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        double averange = sum / lengthArr;
        System.out.println("the average value of all elements in an array is " + averange);

//Find max value in an array with numbers
        int maxEl = 0;
        for (i = 0; i < lengthArr; i++)
            if (array[i] > maxEl) maxEl = array[i];
        System.out.println("max value in your array is " + maxEl);

//( Optional hard task ) find second max element

        int secondMax = 0;
        for (i = 0; i < lengthArr; i++)
            if (array[i] > secondMax && array[i] < maxEl)
                secondMax = array[i];
        System.out.println("second MAX element in your array is " + secondMax);

//Optional hard task sort an integer array with any alghoritm of sorting
        int temp;
        for (i = 0; i < lengthArr; ) {
            for (int j = i + 1; j < lengthArr; ) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

                j++;
            }
            i++;
        }
        System.out.println("your sorted array is ");
        for (int el : array) {
            System.out.print(el + " ");

        }
/*( Optional hard task ) find second max element
works only whit sorted array , metod 2(don't work with equal maxEl in array)*/

        System.out.println("\n second MAX element in your array is " + array[lengthArr - 2]);

    }

}


