package tofan_dmitrii;

//Write a method that takes two integers as parameters and returns the maximum of the two.
public class MethodMax {
        public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        int a = 198;
        int b = 46;
        int c = max(a, b);
        System.out.println("Maximum num = " + c);
    }
}




