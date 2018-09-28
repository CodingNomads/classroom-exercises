package javafundamentals.interfaces;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces {

    public static void main(String[] args) {

        Animal[] animal = new Animal[3];

        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Animal tiger1 = new Tiger();
        animal[0] = cat1;
        animal[1] = dog1;
        animal[2] = tiger1;

        for(int i = 0; i < animal.length; i++) {
            animal[i].sleep();
            animal[i].eat();
        }

    }

}
