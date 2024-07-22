package AnastasiaGoncear;

import java.util.Scanner;

/*Check if a number is positive, negative, or zero using if-else.
int number=10;
     if (number>0) {
         System.out.println("Number is positive");
     }
     else if(number<0) {
         System.out.println("Number is negative");
     } else
     {
         System.out.println("Number is zero");
     }*/
/*int number=9;
     if(number%2==0){
         System.out.println("Number is even");
     }
     else {
         System.out.println("Number is odd");
     }*/
/*int number=7;
     if (number%2==0 && number%3==0){
            System.out.println("%2 and %3");
        } else {
            System.out.println("is not %2 and %3");
        }*/
/*String string;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert a string");
        string=sc.nextLine();
        System.out.println("Length of the string is:", +string.length());
    }*/
/* Find sum of two numbers
     int number1=5;
     int number2=5;
     int summ;

     summ=number1+number2;
        System.out.println("Summ is:"+ summ);*/

/*Check if two numbers are equal
        int number1=9;
        int number2=9;
        if (number1==number2){
            System.out.println("numbers are equal");
        } else {System.out.println("numbers are not equal");
    }*/
//Find the maximum of 3 numbers
/* int number1=1;
int number2=7;
int number3=2;
        if(number1>number2 && number1>number3)
        {System.out.println("numbers1 is the biggest");}
        else if (number2>number1 && number2>number3)
        {System.out.println("numbers2 is the biggest");}
        else
        {System.out.println("numbers3 is the biggest");}}
        }*/
   /* String firstName;
        String lastName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert your firstName");
        firstName = sc.nextLine();
        System.out.println("Insert your lastName");
        lastName = sc.nextLine();
        System.out.print("Length of the string is:" + firstName+ " " + lastName);*/

public class Main {
    public static void main(String[] args) {
        int number = 1;

        switch (number) {

            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            default:
                System.out.println("Number is not zero, one or two");
        }
    }}
