package mirela_b.reflection_annotations;

import java.util.Arrays;
public class MainBox {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();
        Class<?> clazz = box.getClass();

        box.addPair("CARS", 2);
        box.addPair("HOUSES", 4);
        box.addPair("MONEY", 67);
        box.addPair("CARS", 22);
        box.addPair("POOL", 56);
        box.addPair("CARS", 10);

        box.getPair();

        try {
            String[] classAnnotation = clazz.getDeclaredAnnotation(FruitsAnnotation.class).value();
            String[] methodAnnotation = clazz.getDeclaredMethod("addPair", Object.class, Object.class)
                    .getDeclaredAnnotation(FruitsAnnotation.class).value();
            String[] fieldAnnotation = clazz.getDeclaredField("pairList").getDeclaredAnnotation(FruitsAnnotation.class).value();

            System.out.println("\nClass Annotation: " + Arrays.toString(classAnnotation)
                    + "\n" + "Method Annotation: " + Arrays.toString(methodAnnotation)
                    + "\n" + "Field Annotation: " + Arrays.toString(fieldAnnotation));

        } catch (NoSuchMethodException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
