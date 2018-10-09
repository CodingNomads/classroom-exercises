package javafundamentals.annotations;

/**
 * Create your own annotation that must contain at least 3 types and 1 uses a default value.
 * Use the annotation to annotate this class (Ex01Annotation)
 */
@MyAnnotation
public class Ex01Annotation {
}

@interface MyAnnotation {
    public String value() default "";
}