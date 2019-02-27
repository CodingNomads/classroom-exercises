package enums;

/**
 * Create an enum representing some different values.
 * Use it in a switch statement.
 */

public class Ex01Enums {
    public static void main(String[] args) {

        State state = State.values()[0];

        switch (state) {
            case SHIP:
                System.out.println("There is a ship here!");
                break;
            case WATER:
                System.out.println("Just good old water");
                break;
            case DESTROYED:
                System.out.println("Alert! Somebody has been hit!");
                break;
        }
    }
    enum State{
        WATER, SHIP, DESTROYED;
    }
}
