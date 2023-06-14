package zabun_mihail;

import java.util.Scanner;

public class Numbers {


    public static void main(String[] args) {
        randomNum();
        randomNum2();
        maxNumber();
        averNum();
        squareRoot();
    }

    //2. Generate a random number between 0 and 100. (Try the same between 10 and 100)
    public static void randomNum() {
        System.out.println("Method 1: ");
        int a = (int) (Math.random() * 100);
        System.out.println(a);
    }

    // 2.Generate a random number between 1 and 100.
    public static void randomNum2() {
        System.out.println("Method 2: ");
        int b = (int) (10 + (Math.random() * 100));
        System.out.println(b);
    }

    //4. Find the maximum of 4 numbers.
    public static void maxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to calculate the max number: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                if (number1 > number4) {
                    System.out.println("Max: " + number1);
                }
            }
        } else if (number2 > number3) {
            if (number2 > number4) {
                System.out.println("Max: " + number2);
            }
        } else if (number3 > number4) {
            System.out.println("Max: " + number3);
        } else {
            System.out.println("Max: " + number4);
        }
    }

    //    3. Calculate the average of three numbers.
    public static void averNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to calculate the average: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("AVERAGE: " + (number1 + number2 + number3) / 3);
    }
//    1 Find the square root of a number.
    public static void squareRoot() {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
         System.out.println(Math.sqrt(input.nextFloat()));
}
}


