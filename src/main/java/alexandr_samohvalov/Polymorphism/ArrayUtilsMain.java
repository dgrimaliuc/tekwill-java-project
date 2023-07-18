package alexandr_samohvalov.Polymorphism;

public class ArrayUtilsMain {
    public static void main(String[] args) {
        int[] intArray = { 4, 2, 9, 1, 7 };
        double[] doubleArray = { 3.5, 2.1, 6.7, 4.3, 9.2 };
        String[] stringArray = { "apple", "banana", "cherry", "date" };

        int maxInt = ArrayUtils.findMax(intArray);
        double maxDouble = ArrayUtils.findMax(doubleArray);
        String maxString = ArrayUtils.findMax(stringArray);

        System.out.println("Maximum element in intArray: " + maxInt);
        System.out.println("Maximum element in doubleArray: " + maxDouble);
        System.out.println("Maximum element in stringArray: " + maxString);
    }
}
