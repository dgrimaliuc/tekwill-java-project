package alexei_drujinin;

public class Numbers {
    static int b = (int) (Math.random() * 100);
    static int d = (int) (Math.random() * 100);
    static int f = (int) (Math.random() * 100);
    static int j = (int) (Math.random() * 100);

    public static void main(String[] args) {
        squareroot(b);
        randomNumber(d);
        averageOfThreeNumbers();
        maxOffourNumbers();
    }

    public static void squareroot(int a) {
        System.out.println("The square root of " + a + " is " + Math.sqrt(a));
    }

    public static void randomNumber(int c) {
        System.out.println("Your random number is " + c);
    }

    public static void averageOfThreeNumbers() {
        int av = (b + d + f) / 3;
        System.out.println("The average of " + b + " " + d + " " + f + " is " + av);
    }

    public static void maxOffourNumbers() {
        System.out.println("The Max number of " + b + " " + d + " " + f + " " + j + "  is " + Math.max(Math.max(b, d), Math.max(f, j)));
    }
}