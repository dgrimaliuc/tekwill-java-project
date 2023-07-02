package Leas_Liudmila.polymorphism;

public class ArraysUtilsMain {
    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();
        int maxValue1 = arrayUtils.maximumELement(new int[]{25, 68, 55});
        System.out.println(maxValue1);

        float maxValue2 = arrayUtils.maximumELement(new float[]{33.5f, 15.254f, 26.13f});
        System.out.println(maxValue2);

        String maxValue3 = arrayUtils.maximumELement(new String[]{"abc", "xyz", "oop"});
        System.out.println(maxValue3);
    }
}
