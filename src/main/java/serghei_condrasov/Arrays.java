package serghei_condrasov;

public class Arrays {

    public static void main(String[] args) {

        // 1. Write a program that calculates and prints the sum of all elements in an array of integers.
        int sum = 0;
        int[] num = {1,2,3,4,5,6,7};
        for (int i = 0; i <= num.length; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of all elements in an array of integers" + " - "+ sum);

        // 2. Create a program that finds and displays the average value of all elements in an array of floating-point numbers.
        double[] num2 = {1.7,2.5,5.8};
        double sum2 = 0;
        for (int a = 0; a < num2.length; a++) {
            sum2 += num2[a];
        }
        System.out.println("The average value of all elements in an array of floating-point numbers" + " - "
                + sum2 / num2.length);

        // 3. Find max value in an array with numbers.
        int num3[] = {25,30,5,31,7};
        int max = 0;
        for (int x = 0; x < num3.length; x++) {
            if (max < num3[x]) {
                max = num3[x];
            }
        }
        System.out.println("Max value in an array with numbers" + " - " + max);

        // 4. ( Optional hard task ) find second max element.
        int num4[] = {25,30,5,31,7,33,8,35};
        int max1 = num4[0];
        int max2 = num4[1];
        for (int b = 0; b < num4.length; b++) {
            if (num4[b] >= max1) {
                max2 = max1;
                max1 = num4[b];
            }
        }
        System.out.println("The second max element" + " - " + max2);

        // 5. (Optional hard task ) sort an integer array with any alghoritm of sorting
        int myArray[] = {25,30,5,31,7,33,8,35};
        for (int g = 0; g < myArray.length; g++) {
            for (int j = 0; j < myArray.length - g - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        for (int g = 0; g < myArray.length; g++) {
            System.out.println(myArray[g]);
        }
            }
        }
