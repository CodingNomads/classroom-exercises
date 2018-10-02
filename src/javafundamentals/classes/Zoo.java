package javafundamentals.classes;

/**
 * Lets use classes to model the real world (Object oriented programming!!!)
 * <p>
 * This class represents the a Zoo. Its where you will be creating new instances of your other classes and use them.
 * <p>
 * 1: Create another class that represents a place of a Zoo, for example, MonkeyCage.
 * 2: Create another class that represents the animals that go into that place, for example, Monkey.
 * 3: Create another class that represents a recipient for the food of the animals, for example, BananaBasket.
 * 4: Create another class that represents the food inside the recipients, for example, Banana
 * <p>
 * Based on the example the previous classes should:
 * - The MonkeyCage contains Monkeys
 * - The Monkey eats bananas. (Create a method in Monkey that accepts a Banana)
 * - When a Banana is retrieved from the BananaBasket, the amount of Bananas in BananaBasket should decrease by 1.
 * <p>
 * Try to create more variables and more methods in those classes that represents more real world actions and properties
 * NOTE: All the classes should be in their own file.
 */


public class Zoo {

    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        monkey1.setName("Bob");
        Monkey monkey2 = new Monkey();
        monkey2.setName("Billy");
        BananaBasket basket1 = new BananaBasket();
        Banana banana1 = new Banana();
        banana1.setBananaType("Brazil banana");
        Banana banana2=new Banana();
        banana2.setBananaType("very yellow banana");
        basket1.addBanana(banana1);
        basket1.addBanana(banana2);
        MonkeyCage cage1 = new MonkeyCage();
        cage1.setMonkey(monkey1);
        monkey1.eatingABanana(basket1);
        monkey2.eatingABanana(basket1);
    }
}
