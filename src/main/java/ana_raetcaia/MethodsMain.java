package ana_raetcaia;

public class MethodsMain {

    //1.Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int maxOfTwo (int numberOne, int numberTwo){
        int rezult;
        if (numberOne>numberTwo){
            rezult = numberOne;
        }else {
            rezult = numberTwo;
        }
        return rezult;
    }
    //2.Implement a method that calculates the factorial of a given number.
    // The method should take an integer as a parameter and return the factorial value.
    public static int factorialValue (int value) {
        int factorial = 1 ;
        for(int j=1; j <=value; j++) {
            factorial *= j;
        }
        return factorial;
    }
    //3.Write a method that takes an array of integers as a parameter and
    // returns the sum of all the elements in the array.
    public static int elemOfArray (int[]numbers) {
        int sumArr =0;
        for (int j = 0; j < numbers.length; j++) {
            sumArr += numbers[j];
    }
        return sumArr;
    }

    public static void main (String[]args){

    int[] arr = { 4, 7, 2, 8};
        elemOfArray(arr);

        System.out.println("Maximum of the two numbers: "+ maxOfTwo(6,12));
        System.out.println("Factorial value: " + factorialValue(8));
        System.out.println("Sum of all the elements in the array: " + elemOfArray(arr));

    }
}
