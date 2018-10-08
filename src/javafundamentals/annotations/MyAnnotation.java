package javafundamentals.annotations;

import com.sun.org.apache.xpath.internal.operations.Bool;

public @interface MyAnnotation {
    String myString();
    int myValue() default 100;
    boolean myBoolean();
}
