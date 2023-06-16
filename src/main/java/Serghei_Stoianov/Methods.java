package Serghei_Stoianov;

public class Methods {

    //Write a method that takes two integers as parameters and returns the maximum of the two.
    public static int MaxEl(int a, int b) {
        if (a < b) a = b;
        return a;
    }

    //  The method should take an integer as a parameter and return the factorial value.
    static void Factorial(int num) {
        int f = 1;
        for (int i = 0; i++ < num; )
            f *= i;
        System.out.println("factorial value of entered number = " + f);
    }

    //Write a method that takes an array of integers as a parameter and returns the sum of all the elements in the array.
    public static void SumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ) {
            sum += array[i];
            i++;
        }
        System.out.println(sum);
    }

    // write a method which will accept 3 parameters -> sides of a triangle and will return Boolean value if this triangle can exists or not.
    static void ExistTriangleOrNot(int x, int y, int z) {
        if (x + y > z && x + z > y && y + z > x)
            System.out.println("such triangle can exists");
        else System.out.println("such triangle cannot exists");
    }

    public static void main(String[] args) {
        System.out.println("the maximum of the two numbers is " + MaxEl(5, 7));

        Factorial(5);

        int[] arr = {5, 3, 6, 4, 5};
        SumOfArrayElements(arr);

        ExistTriangleOrNot(5, 6, 1);
    }
}
