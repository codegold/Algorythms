package JavaCollections.AnnotationTwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Archie";
    int dateOfCreation() default 2020;
    String purpose();
}
