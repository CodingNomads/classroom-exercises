package inheritance;

public class Motorcycle extends Vehicles {

    public void gearUp() {

        System.out.println("Pressing clutch on motorcycle and moving lever up with foot");

    }

    @Override
    public void turnOn() {

        System.out.println("This motorcycle is turning on by key and using clutch and accelerator");

    }

    @Override
    public void stop() {
        System.out.println("Moto is breaking by using right hand lever and back foot break");
    }
}
