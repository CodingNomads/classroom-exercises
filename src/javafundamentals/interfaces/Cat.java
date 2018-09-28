package javafundamentals.interfaces;

public class Cat implements Animal {


    @Override
    public void sleep() {
        System.out.println("cat sleeps");

    }

    @Override
    public void eat() {
        System.out.println("cat eats");

    }

    @Override
    public void run() {

    }

    public void meows() {
        System.out.println("cat meows");
    }
}
