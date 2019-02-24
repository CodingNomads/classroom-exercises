package inheritance;

public class Airplane extends Vehicles {

    @Override
    public void turnOn() {
        System.out.println("Airplanes is turning on by engaging all engines");
    }

    public void fly() {

        System.out.println("This airplance is flying!!!");

    }

    public void land() {

        System.out.println("Airplane is landing!");

    }
}
