package anna_gontari.Polymorphism;

public class TestingArrayUtils {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int maxValue1 = arrayUtils.maximumElement(new int[]{560, 1, 54, 3, 248});
        System.out.println(maxValue1);

        float maxValue2 = arrayUtils.maximumElement(new float[]{2154.14f, 1.644f, 2154.15f, 548.5f});
        System.out.println(maxValue2);

        String maxValue3 = arrayUtils.maximumElement(new String[]{"Anna", "Awwa", "Azza", "Abba"});
        System.out.println(maxValue3);
    }
}
