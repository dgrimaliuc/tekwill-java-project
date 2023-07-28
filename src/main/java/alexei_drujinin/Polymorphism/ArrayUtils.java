package alexei_drujinin.Polymorphism;

import java.util.Arrays;

public class ArrayUtils {

    public int maximumElement(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;
    }

    public float maximumElement(float[] num) {
        float max = num[0];
        for (int i = 1; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        return max;
    }

    public String maximumElement(String[] num) {
        Arrays.sort(num);
        String max = num[num.length - 1];
        return max;
    }
}
