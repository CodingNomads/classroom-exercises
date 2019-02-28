package enums;

import java.util.Scanner;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Months[] months = Months.values();

        System.out.println("Enter Month:");
        String str = keyboard.nextLine();

        for (int i = 0; i < months.length ; i++) {
            if(str.equalsIgnoreCase(months[i].toString())) {
                System.out.println(dayOfMonths(months[i]));
            }
            else{
                System.out.println("Invalid Month");
            }
        }
    }

    public static int dayOfMonths(Months months){

        int result = 0;

        switch (months){
            case JANUARY: {
                result = 31;
                break;
            }

            case FEBRUARY:{
                result = 28;
                break;
            }

            case MARCH:{
                result = 31;
                break;
            }

            case APRIL:{
                result = 30;
                break;
            }

            case MAY:{
                result = 31;
                break;
            }

            case JUNE:{
                result = 30;
                break;
            }

            case JULY:{
                result = 31;
                break;
            }

            case AUGUST:{
                result = 31;
                break;
            }

            case SEPTEMBER:{
                result = 30;
                break;
            }

            case OCTOBER:{
                result = 30;
                break;
            }

            case NOVEMBER: {
                result = 30;
                break;
            }

            case DECEMBER:{
                result = 31;
                break;
            }
        }

        return result;
    }
}

enum Months{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
