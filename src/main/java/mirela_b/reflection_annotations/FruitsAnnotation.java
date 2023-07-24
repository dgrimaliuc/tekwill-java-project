package mirela_b.reflection_annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})

public @interface FruitsAnnotation {
    String[] value();
}
