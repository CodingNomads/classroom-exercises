package annotations;

/**
 * Create your own annotation that must contain at least 3 types and 1 uses a default value.
 * Use the annotation to annotate this class (Ex01Annotation)
 */

@interface StudentNotes{
    String likeIt = "YES";
    String complexity = "EASY";
    String bootcamp() default "CodingNomads";
    boolean useful = true;
    int numberOfTries = 3;
}

@StudentNotes public class Ex01Annotation {
}
