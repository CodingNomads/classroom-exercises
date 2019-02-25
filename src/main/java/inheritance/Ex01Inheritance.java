package inheritance;

/**
 * Create some classes to represent different vehicles.
 * The parent class should have some methods that are common to all vehicles
 * The subclasses should have behaviour that is specific to that class.
 * Override some methods in the subclasses to make them behave different than in the parent class.
 */

class Vehicle {

    void drive(){
        System.out.println("You can drive the vehicle.");
    }

    boolean needGas(){
        return true;
    }

}

class Car extends Vehicle{

    @Override
    void drive(){
        System.out.println("You can drive a car.");
    }

    @Override
    boolean needGas(){
        System.out.println("Need a refill every few weeks.");
        return true;
    }

}

class Scooter extends Vehicle{

    @Override
    void drive(){
        System.out.println("You can ride a scooter");
    }

    @Override
    boolean needGas(){
        System.out.println("Need a refill every few days.");
        return true;
    }
}
