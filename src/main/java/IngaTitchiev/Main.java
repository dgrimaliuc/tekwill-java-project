iopackage IngaTitchiev;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int number=9;
        if (number>0)
        System.out.println("Pozitive");
        else System.out.println("Negative");

        int a=11;

        if (a % 2 == 0)
            System.out.println("Number is even");
         else
            System.out.println("Number is odd");

        int b = 8;
        if( b % 2 == 0 || b % 3 == 0 ){
            System.out.println("Number is divisible by 2 or 3");
        } else {
            System.out.println("Number is not divisible by 2 or 3");
        }
        String string;
        String name;
        String firstname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter a firstname: ");
        firstname = sc.nextLine();
        System.out.println("Length of the string is: " + name + firstname);


    }

}