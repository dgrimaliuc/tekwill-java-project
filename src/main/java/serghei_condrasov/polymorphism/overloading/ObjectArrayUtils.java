package serghei_condrasov.polymorphism.overloading;

import java.util.*;

public class ObjectArrayUtils {

    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();

        ArrayUtils ArrayUtils = new ArrayUtils();
        int maxValue1 = arrayUtils.maxInt(new int[]{5, 54, 4, 25, 7});
        System.out.println(maxValue1);

        float maxValue2 = arrayUtils.maxFloat(new float[]{25.8f, 38.7f, 38.66f, 38.71f});
        System.out.println(maxValue2);

        String maxValue3 = arrayUtils.maxString(new String[]{"qwerty", "ygpk", "148"});
        System.out.println(maxValue3);
    }
}