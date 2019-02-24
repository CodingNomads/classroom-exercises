package interfaces;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces {
    public static void main(String[] args) {

        Electronics smartwatch = new Electronics();
        Smartphone iPhone = new Smartphone();
        Computer macBook = new Computer();

        Electronics[] electroTown = {smartwatch,iPhone,macBook};

        for (Electronics i : electroTown) {
            i.turnOn();
            i.takeInput();
            i.consumeElectricity();
            System.out.println();
        }

    }
}
