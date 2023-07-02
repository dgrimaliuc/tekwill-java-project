package Leas_Liudmila.polymorphism;

import java.util.Arrays;

//Create a class called "ArrayUtils" with an overloaded method for finding the maximum element.
//Implement methods that can find the maximum element in an array of integers, an array of floating-point numbers, and an array of strings.
public class ArrayUtils {
    public int maximumELement(int[] num) {
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;
    }

    public float maximumELement(float[] num) {
        float max = num[0];

        for (int i = 1; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;
    }

    public String maximumELement(String[] num) {

        Arrays.sort(num);
        String max = num[num.length - 1];
        return max;
    }


}
