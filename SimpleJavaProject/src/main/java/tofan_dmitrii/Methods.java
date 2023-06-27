package tofan_dmitrii;

public class Methods {

        //Write a method that takes two integers as parameters and returns the maximum of the two.
        public static int intMax( int a, int b) {
            return Math.max(a, b);
        }

        //Implement a method that calculates the factorial of a given number.
        //The method should take an integer as a parameter and return the factorial value.
        public static int factorial ( int number){
            if (number == 0 || number == 1) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }
        }

        //Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
        public static int sumArray ( int[] arr){
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    }

