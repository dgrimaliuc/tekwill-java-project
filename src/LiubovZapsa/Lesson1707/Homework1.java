package LiubovZapsa.Lesson1707;

public class Homework1 {

    static int getMaxNumber(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        int num3 = 9;
        int maxNumber = getMaxNumber(num1, num2, num3);

        System.out.println("Max number: " + maxNumber);
    }
}



