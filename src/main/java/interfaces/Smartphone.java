package interfaces;

public class Smartphone extends Electronics implements Electronicable {

    public void charge() {
        System.out.println("Smartphone has started to charge from a plug on the wall");
    }

    public void playMusic() {
        System.out.println("Smartphone is playing some tunes");
    }

    @Override
    public void takeInput() {
        System.out.println("Smartphone is taking input through the use of a touch-screen");
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on...");
    }

    @Override
    public void consumeElectricity() {
        System.out.println("Smartphone is consuming electricity from a battery on the back");
    }
}
