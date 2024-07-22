package UlianaScolnicova;

public class Lesson_Auto3 {
    public static void main(String[] args) {
         System.out.println("-----Lesson 12.07.2024-----");
        System.out.println("-----WHILE Loop-----");
        //-----Write a program that counts from 10 to 1 using a while loop-----
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("---------------------------------------------------------------");
        //-----Write a program that prints the sum of all even numbers from 0 to 50 using a while loop-----
        count = 0;
        int sum = 0;
        while (count <=50) {
            if (count % 2 == 0) {
                sum = sum + count;
            }
            count++;
        }
        System.out.println("The sum of all even numbers from 0 to 50 is: " + sum);

       System.out.println("---------------------------------------------------------------");
       System.out.println("-----FOR Loop-----");
        //-----Write a program that counts from 10 to 1 using a for loop-----
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("---------------------------------------------------------------");
        //-----Write a program that prints the sum of all odd numbers from 1 to 51 using a for loop
        sum = 0;
        for (int i = 1; i <= 51; i++) {
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.println("The sum of all odd numbers from 1 to 51 is: " + sum);


        System.out.println("---------------------------------------------------------------");
        System.out.println("-----Arrays-----");
        //-----Write a Java program to check if an element exists in an integer array-----
        int[] arr = {10, 2, 13, 48, 5, 61, 17, 8, 29, 10};
        if (arr.length > 0){
            System.out.println("Element exists");
        }else{
            System.out.println("No elements");
        }


        System.out.println("---------------------------------------------------------------");
        //-----Write a Java program to count the number of positive elements in an integer array-----
        int[] arr2 = {10, -2, -13, 48, -85, 61, -17, 48, 29, 101};
        int quantity = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>=0){
                quantity++;
            }
        }
        System.out.println("The number of positive elements in an integer array is: " + quantity);



        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("---------------------------Home Work---------------------------");
        System.out.println("---------------------------------------------------------------");
        /*1)      While
        Calculate the sum of numbers from 55 to 111 using a do-while loop.
        2)      For
        Calculate the sum of numbers from 1 to 100 using a for loop.
        3)      Arrays
        Create a program that finds and displays the average value of all elements
        in an array of floating-point numbers.
         */
        sum = 0;
        count = 55;
        do {
            sum += count;
            count++;
        } while (count <= 111);
        System.out.println("1) The sum of numbers from 55 to 111 is: " + sum);

        System.out.println("\n---------------------------------------------------------------");
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("2) The sum of numbers from 1 to 100 is: " + sum);


        System.out.println("\n---------------------------------------------------------------");
        float[] arr3 = {10, -2, -13, 48, -85, 61, -17, 47, 29, 101};
        float sumFloat = 0;
        count = 0;
        for (float number: arr3){
            sumFloat = sumFloat + number;
            count++;
        }
        System.out.println("3) The average value of all elements in an array is: " + sumFloat / count);
    }
}