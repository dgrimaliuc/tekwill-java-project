package ana_raetcaia;

import java.util.Scanner;

public class NumbersMain {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextInt();
        System.out.println(Math.sqrt(number));

        double num1 = Math.random();
        int rezult1 = (int)(num1 *100+0);
        System.out.println("Random number between 0 and 100:" + rezult1);

        double num2 = Math.random();
        int rezult2 = (int)(num2 *100+10);
        System.out.println("Random number between 10 and 100:" + rezult2);


        int numberOne = 4;
        int numberTwo = 6;
        int numberThree = 8;
        int numberFour = 2;

        int result1 = Math.max(numberOne,numberTwo);
        int result2 = Math.max(result1,numberThree);
        int result3 = Math.max(result2 ,numberFour);
        System.out.println("Maximum of 4 numbers: " + result3);

        NumbersMain averageObj = new NumbersMain();
        System.out.println("Average of three numbers:" + averageObj.averageOfThree(2,4,7));
    }
     Number averageOfThree(int number1,int number2, int number3){
        int sum = number1 + number2 + number3;
        return sum/3;
    }


}

