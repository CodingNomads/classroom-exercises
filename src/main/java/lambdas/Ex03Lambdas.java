package lambdas;

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
        //anonymous classes
        Predicate<String> borderCheckVisa = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return (s.equals("paid"));
            }
        };

        Ex03Methods.checkPassport(borderCheckVisa, "paid");
        Ex03Methods.checkPassport(borderCheckVisa, "sdfsdf");

        System.out.println();

        Predicate<Integer> borderIssueYears = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        Ex03Methods.issueYears(borderIssueYears, 1);
        Ex03Methods.issueYears(borderIssueYears, 6);


        System.out.println();

        //lambda equivalents
        Predicate<String> borderCheckVisaLambda = (s) -> s.equals("paid");
        Ex03Methods.checkPassport(borderCheckVisaLambda, "paid");

        System.out.println();

        Predicate<Integer> borderIssueYearsLambda = (n) -> n>0;
        Ex03Methods.issueYears(borderIssueYearsLambda, 2);
    }

}

class Ex03Methods {

    public static void checkPassport(Predicate<String> checkVisa, String visa) {
        checkVisa.test(visa);
        if (visa == "paid") {
            System.out.println("Visa paid - please enter the country.");
        } else {
            System.out.println("Visa not paid - please pay first.");
        }
    }

    public static boolean issueYears(Predicate<Integer> checkValidity, Integer validYears){
        checkValidity.test(validYears);
        if (validYears >= 1 && validYears < 5){
            System.out.println("You have been issued 1 year.");
            return true;
        } else if (validYears >= 5){
            System.out.println("You have been issued 5 years.");
            return true;
        } else {
            System.out.println("Not enough years valid in your passport!");
            return false;
        }

    }

}