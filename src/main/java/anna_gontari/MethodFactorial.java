package anna_gontari;

public class MethodFactorial {
    //Implement a method that calculates the factorial of a given number.
    // The method should take an integer as a parameter and return the factorial value.
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    private static int factorial (int n){
        if(n==1) return 1;
        return n * factorial (n-1);
    }
}

