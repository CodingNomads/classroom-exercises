package enums;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {

    public static void main(String[] args) {

        for(Days d: Days.values()){
            printDays(d);
        }

    }

    public static void printDays(Days theDay){

        switch(theDay){

            case Monday:
                System.out.println("Today is Monday");
                break;

            case Tuesday:
                System.out.println("Today is Tuesday");
                break;

            case Wednesday:
                System.out.println("Today is Wednesday");
                break;

            case Thursday:
                System.out.println("Today is Thursday");
                break;

            case Friday:
                System.out.println("Today is Friday");
                break;

            case Saturday:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Today is Sunday");

        }
    }

}


enum Days{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}