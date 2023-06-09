package roman_marcov;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
/*
If else switch
2. Check if a number is positive, negative, or zero.
3. Check if a number is divisible by both 2 and 3.
4. Determine the grade based on a given score.
A > 90
B > 80
C > 70
Else D
 */
    //#2
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        if (num > 0){
            System.out.println(num + " - Is a positive number");
        }else if (num < 0){
                System.out.println(num + " - Is a negative number");
        }
        else {
            System.out.println("The number is zero");
        }*/
    //#3
        /* Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan1.nextInt();
        if ((n % 2 == 0) && (n % 3 == 0)){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }*/
    //#4
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks:");
        double grade = scan.nextDouble();

        if(grade > 90){
            System.out.println("Excellent: Grade A");
        }else if(grade > 80){
            System.out.println("Very Good: Grade B");
        }else if(grade > 70){
            System.out.println("Good: Grade C");
        }else {
            System.out.println("Grade D");
        }
    }
}
