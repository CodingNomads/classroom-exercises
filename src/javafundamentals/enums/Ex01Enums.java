package javafundamentals.enums;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {
    public static void main(String[] args) {
        Months myMonths = Months.FEBRUARY;

        switch (myMonths) {
            case JANUARY:
                System.out.println("It's January");
                break;
            case FEBRUARY:
                System.out.println("It's February");
                break;
            case MARCH:
                System.out.println("It's March");
                break;
            case APRIL:
                System.out.println("It's April");
                break;
            case MAY:
                System.out.println("It's May");
                break;
            case JUNE:
                System.out.println("It's June");
                break;
            case JULY:
                System.out.println("It's July");
                break;
            case AUGUST:
                System.out.println("It's August");
                break;
            case SEPTEMBER:
                System.out.println("It's September");
                break;
            case OCTOBER:
                System.out.println("It's October");
                break;
            case NOVEMBER:
                System.out.println("It's November");
                break;
            case DECEMBER:
                System.out.println("It's December");
        }
    }
}
