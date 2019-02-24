package inheritance;

/**
 * Create some classes to represent different vehicles.
 * The parent class should have some methods that are common to all vehicles
 * The subclasses should have behaviour that is specific to that class.
 * Override some methods in the subclasses to make them behave different than in the parent class.
 */

public class Ex01Inheritance {

    public static void main(String[] args) {

        Vehicles vehicle = new Vehicles();
        vehicle.turnOn();
        vehicle.accelerate();
        vehicle.stop();
        System.out.println();

        Motorcycle moto = new Motorcycle();
        moto.turnOn();
        moto.gearUp();
        moto.stop();
        System.out.println();

        Airplane avion = new Airplane();
        avion.turnOn();
        avion.fly();
        avion.land();


    }

}