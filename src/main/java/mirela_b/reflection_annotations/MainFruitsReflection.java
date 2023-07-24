package mirela_b.reflection_annotations;

import java.util.Arrays;

public class MainFruitsReflection {
    public static void main(String[] args) {
        FruitsAnnotationsClass fruits = new FruitsAnnotationsClass();
        Class<?> clazz = fruits.getClass();

        try {
            String[] classAnnotation = clazz.getDeclaredAnnotation(FruitsAnnotation.class).value();
            String[] methodAnnotation = clazz.getDeclaredMethod("getBanana")
                    .getDeclaredAnnotation(FruitsAnnotation.class).value();
            String[] fieldAnnotation = clazz.getDeclaredField("banana").getDeclaredAnnotation(FruitsAnnotation.class).value();

            System.out.println(Arrays.toString(classAnnotation)
                    + "\n" + Arrays.toString(fieldAnnotation)
                    + "\n" + Arrays.toString(methodAnnotation));

        } catch (NoSuchMethodException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
