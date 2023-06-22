package ana_raetcaia;

public class ArrayMain {

    public static void main(String[] args) {
        //1.Write a program that calculates and prints the sum of all elements in an array of integers.
        int[] elements = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println("calculates and prints the sum of all elements: " + sum);

        //2.Create a program that finds and displays the average value of all elements
        // in an array of floating-point numbers.
        int[] numbers = {1, 2, 3, 5};
        int sumAvr = 0;
        float AverageA = 0;

        for (int j = 0; j < numbers.length; j++) {
            sumAvr += numbers[j];
            AverageA = sumAvr / numbers.length;
        }
        System.out.println("Average value: " + AverageA);

        //3.Find max value in an array with numbers
        long[] num = new long[3];
        for (int r = 0; r < num.length; r++) {
            num[r] = Math.round(Math.random() * 10);
        }
        for (int r = 0; r < num.length; r++) {
            System.out.println(num[r]);
        }
        long max= num[0];
        for (int r = 0; r < num.length; r++) {
            if (num[r]>max){
                max = num[0];
            }

        }
        System.out.println("Max number:" + max);

    }
}
