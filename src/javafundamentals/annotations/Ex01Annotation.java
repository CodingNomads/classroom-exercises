package javafundamentals.annotations;

/**
 * Create your own annotation that must contain at least 3 types and 1 uses a default value.
 * Use the annotation to annotate this class (Ex01Annotation)
 */

public class Ex01Annotation {
    public static void main(String[] args) {
        Ex01Annotation myInstance = new Ex01Annotation();
        myInstance.methodForAnnotating();
    }
    @MyAnnotation(myString="This is a string", myValue=200, myBoolean = true)
    public void methodForAnnotating(){
        System.out.println("This is an annotated method!");
    }
}
