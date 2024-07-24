package AnastasiaGoncear.Lesson5AnastasiaGoncear;
//Write a Java method called "printNumbers" that takes an integer as a parameter and prints
// all the numbers from 1 to that integer.
public class NumberPrinter {

    public static void printNumbers(int n) {
        if (n < 1) {
            System.out.println("The number should be greater than or equal to 1.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}