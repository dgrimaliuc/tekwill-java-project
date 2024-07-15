package Lesson3AnastasiaGoncear;

public class WhileLoop {
    public static void main(String[] args) {
       /* int count=10;
        while (count>0)
        { System.out.println(count);
            count--;
        }}}*/

        int count = 0;
        int sum = 0;

        while (count <= 500) {
            sum = sum + count;
            count += 2;
        }

        System.out.println("Sum of all even numbers between 1 and 50 is: " + sum);

    }}