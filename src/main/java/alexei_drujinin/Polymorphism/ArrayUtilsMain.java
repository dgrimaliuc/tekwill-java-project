package alexei_drujinin.Polymorphism;

public class ArrayUtilsMain {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int maxValue1 = arrayUtils.maximumElement(new int[]{5, 10, 4, 30, 34});
        System.out.println(maxValue1);

        float maxValue2 = arrayUtils.maximumElement(new float[]{3.14f, 1.6f, 5.5f, 8.1f});
        System.out.println(maxValue2);

        String maxValue3 = arrayUtils.maximumElement(new String[]{"Jack", "Maicl", "Sam", "Antony"});
        System.out.println(maxValue3);
    }
}
