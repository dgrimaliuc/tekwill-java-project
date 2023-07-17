package alexei_drujinin;


public class Methods {
    public static void main(String[] args) {
        //1
        int result = max(3, 4);
        System.out.println("the max parameter is " + result);
        //2
        int fact;
        int number = 5;
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
        //3
        int[] array = {4, 6, 8, 9, 3, 2};
        System.out.println("sum of all the elements in the array = " + sumOfElements(array));
        //4
        int d = 1;
        int e = 13;
        int f = 100;
        if (checkTriangle(d, e, f))
            System.out.println("this triangle can be created");
        else
            System.out.println("such triangle cannot exists");

    }

    //1.Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    //2.Implement a method that calculates the factorial of a given number.
    // The method should take an integer as a parameter and return the factorial value.
    public static int factorial(int c) {
        if (c == 0) return 1;
        else return (c * factorial(c - 1));
    }

    //3.Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
    public static int sumOfElements(int[] array) {
        int sum = 0;
        int i;
        for (i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    //4.( Optional hard task ) write a method which will accept 3 parameters -> sides of a triangle and will return Boolean value if this triangle can exists or not.
    public static boolean checkTriangle(int d, int e, int f) {
        return (d + e > f && d + f > e && e + f > d);

    }
}