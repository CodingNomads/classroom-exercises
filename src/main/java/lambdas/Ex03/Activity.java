package lambdas.Ex03;

import java.util.function.Function;
import java.util.function.Predicate;

public class Activity {

    public boolean evaluateNumber (Predicate predicate, Integer number) {
        return predicate.test(number);
    }

    public Double divideANumber (Function function, Double number) {
        return (Double) function.apply(number);
    }

}
