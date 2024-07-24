package AnastasiaGoncear.Lesson3AnastasiaGoncear;

public class ForLoop {
    public static void main(String[] args) {
       /* for (int i=10;i>1;i--){
            System.out.println(i);
        }*/
        int sum = 0;

        // Loop through all numbers from 1 to 51
        for (int i = 1; i <= 51; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i; // Add the odd number to the sum
            }
        }

        // Print the final sum
        System.out.println("The sum of all odd numbers from 1 to 51 is: " + sum);
    }
}
