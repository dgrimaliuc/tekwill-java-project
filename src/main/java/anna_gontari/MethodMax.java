package anna_gontari;

public class MethodMax {
    //Write a method that takes two integers as parameters and returns the maximum of the two.
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = max(a, b);
        System.out.println("Maximum Value = " + c);
    }

    public static int max(int n1, int n2) {
        int max;
        if (n1 < n2)
            max = n2;
        else
            max = n1;

        return max;
    }
}
