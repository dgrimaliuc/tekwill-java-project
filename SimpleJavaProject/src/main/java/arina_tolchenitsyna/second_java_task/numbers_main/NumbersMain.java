package arina_tolchenitsyna.second_java_task.numbers_main;

import java.util.Random;

public class NumbersMain {
    public static void main(String[] args) {
        int number = 9;
        int squareRoot = (int) Math.sqrt(number);
        System.out.println("Number is: " + number + " The root of this number is: " + squareRoot);

        Random random = new Random();
        int newRandom = random.nextInt(100);
        System.out.println("The random number between 0 and 100 is: " + newRandom);

        int randomNew = random.nextInt(91) + 10;
        System.out.println("The random number between 10 and 100 is: " + randomNew);

        int number1 = 100;
        int number2 = 25;
        int number3 = 5;
        int calculateAverage = (number1 + number2 + number3) / 3;
        System.out.println("The average of 100, 25 and 5 is: " + calculateAverage);

        int num1 = 135;
        int num2 = 106;
        int num3 = 35;
        int num4 = 136;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        System.out.println("The maximum of four numbers is: " + max);
        

    }
}
