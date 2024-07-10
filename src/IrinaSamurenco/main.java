package IrinaSamurenco;

import java.util.Scanner;

public class main {
    /*public static void main (String[] args){
        int a = 15;
        int b = 5;
        int c = a+b;

        System.out.println(c);
        if (a == b) {
            System.out.println("This numbers are equal");
        } else {
            System.out.println("These numbers differ");
        }
        if (c>0) {
            System.out.println("c is a positive number");
        } else if (c<0) {
            System.out.println("c is a negative number");
        } else if (c==0) {
            System.out.println("c is zero");
        }

        int largest = Math.max(Math.max(a, b), c);
        System.out.println("The largest number is: " + largest);
    }*/
    public static void main(String[] args) {
        String name;
        String surname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name = sc.nextLine();
        System.out.println("Enter your Surname: ");
        surname = sc.nextLine();
        System.out.println("Hello " + name + " " + surname);
    }
}
