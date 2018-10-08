package javafundamentals.classes;

import java.util.Objects;

public class Monkey {
    private String name;

    public void eatBanana (BananaBasket bananaBasket) {
        if (bananaBasket.getNoOfBananas() > 0) {
            Banana bananaToBeEaten = bananaBasket.takeBanana();
            System.out.println(name + " ate " + bananaToBeEaten.getType());
        } else {
            System.out.println("There are no more bananas in this basket!");
        }
    }

    public Monkey(String name) {
        this.name = name;
    }
}
