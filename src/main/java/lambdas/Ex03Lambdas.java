package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Create a class with 2 methods.
 * One accepts a Predicate and another that accepts a function
 * <p>
 * Use anonymous classes to pass to those methods
 * Replace them with lambdas
 */

public class Ex03Lambdas {
    public static void main(String[] args) {
        Methods check = new Methods();
        Predicate<String> checkVisa = (passport) -> (passport.equals("paid"));
        check.checkPassport(checkVisa, "not paid");
        check.checkPassport(checkVisa, "paid");

        Function<Integer,Integer> issueVisa = (passportValidYears) -> {
            if(passportValidYears > 5) {
                return 10;
            } else {
                return 5;
            }
        };
        check.validYears(issueVisa, 3);
        check.validYears(issueVisa, 7);
    }
}

class Methods {

    public void checkPassport(Predicate<String> borderControl, String passport) {
        boolean isValid = borderControl.test(passport);
        if (isValid) {
            System.out.println("Please enter.");
        } else {
            System.out.println("Please go back.");
        }
    }

    public void validYears(Function<Integer, Integer> issueVisa, int passportValidYears){
        int issuedYears = issueVisa.apply(passportValidYears);
        System.out.println(issuedYears);
    }
}