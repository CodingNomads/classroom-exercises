package javafundamentals.interfaces;

public class Mexican implements Person {

    public void haveSiesta() {
        System.out.println("Having siesta");
    }

    @Override
    public void speak() {
        System.out.println("Speaking spanish");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burritos");
    }
}
