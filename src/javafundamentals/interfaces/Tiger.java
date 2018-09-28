package javafundamentals.interfaces;

public class Tiger implements Animal{


    @Override
    public void sleep() {
        System.out.println("tiger sleeps");

    }

    @Override
    public void eat() {
        System.out.println("tiger eats");

    }

    @Override
    public void run() {
        System.out.println("tiger runs");

    }

    public void growl() {
        System.out.println("tiger growls");
    }
}
