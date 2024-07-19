package ChirilBortnicov;

public class Task7 {


    /* 1. Write a Java method called "greet" that prints a greeting message to the console, such as "Hello World! »
       2. Write a method that takes two integers as parameters and returns difference.(-)
       3. Create a method that accepts three integers as parameters and returns the maximum of the three.
       4. Create a method that will accept arguments of Integer type, return the sum of all provided numbers.
       5. Write a Java method called "printNumbers" that takes an integer as
        a parameter and prints all the numbers from 1 to that integer.
     */
    static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    static int diff(){
        int num1 = 3;
        int num2 = 2;
        return num1 - num2;
    }

    static int bigger() {
        int a = 4;
        int b = 20;
        int c = 50;
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    static void summ(){
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;
        int num4 = 7;
        int sum = num1 + num2 + num3 + num4;
        System.out.println(sum);
    }
    static void printNumbers() {
        int num = 10;
        for(int i = 1; i <= num; i++)
            System.out.println(i);
    }



    public static void main(String[] args) {
        greet("World");
        System.out.println(diff());
        System.out.println(bigger());
        summ();
        printNumbers();

    }
}
