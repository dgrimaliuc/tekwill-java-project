package AnastasiaGoncear.Lesson3AnastasiaGoncear;

//Calculate the sum of numbers from 55 to 111 using a do-while loop.
public class HomeWorkWhile {
    public static void main(String[] args) {
        int sum = 0;
        int number = 55;
        do {
            sum = sum + number;
            number++;
        } while (number <= 111);

        System.out.println("Sum of all numbers is: " + sum);
    }

}
