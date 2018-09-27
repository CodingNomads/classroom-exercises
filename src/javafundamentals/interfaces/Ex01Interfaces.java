package javafundamentals.interfaces;


import com.sun.jdi.event.MethodExitEvent;

/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces {
    public static void main(String[] args) {

        Person andy = new Englishman();
        Person tom = new Englishman();

        Person jose = new Mexican();
        Person jesus = new Mexican();

        Person[] people = {andy, tom, jose, jesus};

        for (Person p:
             people) {
            p.cook();
            p.speak();
        }

    }
}

