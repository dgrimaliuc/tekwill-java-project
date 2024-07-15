package IrinaSamurenco;

/* int count = 10;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Odd numbers sum");

        int sum = 0;
        for (int i = 1; i <= 51; i++)
        {
            if (i % 2 != 0)
                sum = sum + i;

        }
        System.out.println(sum);

        System.out.println("Sum");
        int sum1 = 0;
        for (int i = 1; i<=51; i++)
        {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);*/

// Write a Java program to check if an element exists in an integer array.
       /* int [] arr = {12, 7, 9, 25, 16, 45, 82, 13, 5, 53};
        int el = 53;
        boolean ex = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == el) {
                ex = true;
                //System.out.println(ex);
            }
            //System.out.println(arr[i]);
        }
        if (ex == true) {
            System.out.println("this element" + " " + el + " exists in array");
        } else {
            System.out.println("this element" + " " + el + " does not exist");
        }*/


//Write a Java program to count the number of positive elements in an integer array.
       /* int[] arr = {12, -7, 9, -25, 16, 45, -82, 13, 5, 53};
        int count = 0;
        int sum = 0;
        for(int i : arr) {
            if (i>=0){
                count++;
                sum+=i;
                //System.out.println(i);
            }
        }
        System.out.println("The number of positive elemnets is : "+ count+ " and the sum of the elements is: " + sum);*/

public class task3 {
    public static void main(String[] args) {

        // Homework

        //Calculate the sum of numbers from 55 to 111 using a do-while loop.
        int num = 55;
        int sum = 0;

        do {
            sum+=num;
            num++;
        } while (num<=111);
        System.out.println("The sum of numbers from 55 to 111 = " + sum);



        //Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum2 = 0;
        for(int i=0; i<=100; i++) {
            sum2+=i;
        }
        System.out.println("The sum of numbers from 1 to 100 = " + sum2);


        //Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        float[] arr = {23.0f, 5.5f, 12.3f};
        float sum3 = 0.0f;
        float avg = 0.0f;
        for(float i : arr) {
            sum3+=i;
        }
        avg = sum3/arr.length;
        System.out.println("The average value of all elements in an array is " + avg);

    }

}
