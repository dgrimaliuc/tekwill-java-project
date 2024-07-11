package IgorTabirta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = -5;
        int x = 10;
        int y = 5;
        //1 . Find a sum
        int sum = x + y;
        System.out.println(sum);
        //2. Number is equal or not
        int a = 3;
        int b = 4;
        if (a == b) {
            System.out.println("Numbers is equal");
        } else System.out.println("Number is't equal");
        // 3.  If number is positive or negative or zero
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        // 4.  Find the Max with 2 args
        if (a > b) {
            System.out.println("a number is MAX");
        } else System.out.println("b number is MAX");
        // 5. Enter a Name and surname
        String name;
        String surname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type yr name");
        name = sc.nextLine();
        System.out.println("Type yr surname");
        surname = sc.nextLine();
        System.out.println("Hello " + name + " " + surname);

        // 6. Find the  Max with 3 args
        if (a > b && a > x) {
            System.out.println("a is MAX");
        } else if (b > a && b > x) {
            System.out.println("b is MAX");
        } else if (x > a && x > b) {
            System.out.println("x is MAX");
        }
    }
}

