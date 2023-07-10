package oleg_tabanski;

public class ConditionMain {
    public static void main(String[] args) {
        //Find the maximum of 4 numbers.
        int num1 = 3;
        int num2 = 5;
        int num3 = 9;
        int num4 = 4;

        int result = Math.max(num1, num2);
        int result2 = Math.max(result, num3);
        int result3 = Math.max(result2, num4);
        System.out.println(result3);
    }
}
