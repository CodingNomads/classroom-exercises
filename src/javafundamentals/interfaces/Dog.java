package javafundamentals.interfaces;

public class Dog implements Animal {


    @Override
    public void sleep() {
        System.out.println("dog sleeping");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");

    }

    @Override
    public void run() {

    }

    public void barks() {
        System.out.println("dog barks");
    }
}
