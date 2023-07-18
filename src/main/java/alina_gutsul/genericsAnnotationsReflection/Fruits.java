package alina_gutsul.genericsAnnotationsReflection;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface Fruits {
    String[] value();
}

@Fruits(value = {"Apple", "Orange"})
class MyClass {
    @Fruits(value = {"Strawberry", "Grapes"})
    private String fruitField;

    @Fruits(value = {"Banana", "Mango"})
    public void fruitMethod() {
    }
}

