package interfaces;

public class Computer extends Electronics implements Electronicable {

    @Override
    public void takeInput() {
        System.out.println("Computer is taking input from the keyboard and mouse");
    }

    public void processTextFile() {
        System.out.println("Computer is parsing a text file");
    }

    @Override
    public void turnOn() {
        System.out.println("Computer is turning on...");
    }

    @Override
    public void consumeElectricity() {
        System.out.println("Computer is consuming electricity from wall plug and battery");
    }
}
