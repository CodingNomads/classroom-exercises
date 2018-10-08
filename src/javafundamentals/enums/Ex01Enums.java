package javafundamentals.enums;

import static javafundamentals.enums.Ex01Enumeration.*;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {
    public static void main(String[] args) {
        FilterThroughEnum myFilter = new FilterThroughEnum();
        System.out.println(myFilter.filterThroughEnum(TWO));
    }
}

class FilterThroughEnum {
    public Integer filterThroughEnum(Ex01Enumeration number) {
        switch (number) {
            case ONE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            default:
                return 0;
        }
    }
}

