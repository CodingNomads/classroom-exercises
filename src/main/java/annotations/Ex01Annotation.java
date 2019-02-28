package annotations;

/**
 * Create your own annotation that must contain at least 3 types and 1 uses a default value.
 * Use the annotation to annotate this class (Ex01Annotation)
 */

public class Ex01Annotation {
    public static void main(String[] args) {

    }

    @MyAnnotation(name = "MathMethod", val =200)
    public static int add(int number1, int number2){
        return number1 + number2;
    }
}


@interface MyAnnotation{
    String creator = "Alp";
    String name();
    int val();


}