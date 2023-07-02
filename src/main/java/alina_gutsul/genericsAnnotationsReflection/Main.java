package alina_gutsul.genericsAnnotationsReflection;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;

        Fruits classFruits = myClass.getAnnotation(Fruits.class);
        if (classFruits != null) {
            System.out.println("Class level fruits: " + Arrays.toString(classFruits.value()));
        }
        try {
            Fruits methodFruits = myClass.getDeclaredMethod("fruitMethod").getAnnotation(Fruits.class);
            if (methodFruits != null) {
                System.out.println("Method level fruits: " + Arrays.toString(methodFruits.value()));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        try {
            Fruits fieldFruits = myClass.getDeclaredField("fruitField").getAnnotation(Fruits.class);
            if (fieldFruits != null) {
                System.out.println("Field level fruits: " + Arrays.toString(fieldFruits.value()));
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
